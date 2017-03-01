package v2.decorator;

/**
 * Created by wangym on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new OriginalComponentImpl();
        component = new P1DecoratorImpl(component);
        component = new P2DecoratorImpl(component);
        component.operate();
        System.out.println("-------------------");
        component = new OriginalComponentImpl();
        component = new P2DecoratorImpl(component);
        component = new P1DecoratorImpl(component);
        component.operate();
    }

}
