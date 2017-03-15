package v2.visitor;

/**
 * Created by wangym on 2017/3/14.
 */
public class P1ElementImpl extends Element {
    @Override
    public void doSomething() {
        System.out.println("P1 is doing good things");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
