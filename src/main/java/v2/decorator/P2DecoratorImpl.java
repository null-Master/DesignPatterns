package v2.decorator;

/**
 * Created by wangym on 2017/3/1.
 */
public class P2DecoratorImpl extends Decorator {
    public P2DecoratorImpl(Component component) {
        super(component);
    }

    private void method () {
        System.out.println("P2 decorator is doing something.");
    }

    @Override
    public void operate() {
        super.operate();
        method();
    }
}
