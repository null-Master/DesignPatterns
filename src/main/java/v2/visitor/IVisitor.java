package v2.visitor;

/**
 * Created by wangym on 2017/3/14.
 */
public interface IVisitor {
    void visit(P1ElementImpl element);
    void visit(P2ElementImpl element);
    void visit(Element element);
}
