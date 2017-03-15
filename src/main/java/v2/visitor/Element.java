package v2.visitor;

/**
 * Created by wangym on 2017/3/14.
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
