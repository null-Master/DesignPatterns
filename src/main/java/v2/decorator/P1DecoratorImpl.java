package v2.decorator;

/**
 * Created by wangym on 2017/3/1.
 */
public class P1DecoratorImpl extends Decorator {
    public P1DecoratorImpl(Component component) {
        super(component);
    }

    //定义自己的装饰方法
    private void method() {
        System.out.println("P1 decorator is doing something.");
    }

    @Override
    public void operate() {
        method();
        super.operate();
    }
}
