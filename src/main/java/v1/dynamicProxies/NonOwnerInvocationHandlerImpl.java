package v1.dynamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangym on 2017/1/9.
 */
public class NonOwnerInvocationHandlerImpl implements InvocationHandler {
    PersonBean person;

    public NonOwnerInvocationHandlerImpl(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        Object ret = null;
        try {
            if (method.getName().startsWith("get")) {
                ret = method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                ret = method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
