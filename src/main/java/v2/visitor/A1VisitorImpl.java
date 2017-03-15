package v2.visitor;

/**
 * Created by wangym on 2017/3/14.
 */
public class A1VisitorImpl implements IVisitor {
    @Override
    public void visit(P1ElementImpl element) {
        System.out.println("P1start: ");
        element.doSomething();
        System.out.println("P1end. ");
    }

    @Override
    public void visit(P2ElementImpl element) {
        System.out.println("P2start: ");
        element.doSomething();
        System.out.println("P2end. ");
    }

    @Override
    public void visit(Element element) {
        System.out.println("P0start: ");
        element.doSomething();
        System.out.println("P0end. ");
    }
}
