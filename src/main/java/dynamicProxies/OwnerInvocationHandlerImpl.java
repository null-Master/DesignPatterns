package dynamicProxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangym on 2017/1/9.
 */
public class OwnerInvocationHandlerImpl implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandlerImpl(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        Object ret = null;
        try {
            if (method.getName().startsWith("get")) {
                ret = method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                ret = method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
