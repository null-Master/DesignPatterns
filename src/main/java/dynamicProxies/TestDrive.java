package dynamicProxies;

import java.lang.reflect.Proxy;

/**
 * Created by wangym on 2017/1/9.
 */
public class TestDrive {
    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandlerImpl(person));
    }
    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandlerImpl(person)
        );
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("male");
        joe.setInterests("sports");

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println(ownerProxy.getInterests());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        System.out.println(ownerProxy.getInterests());

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Can't set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("basketball");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Can't set interests from non owner proxy");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    public static void main(String[] args) {
        TestDrive testDrive = new TestDrive();
        testDrive.drive();
    }

}
