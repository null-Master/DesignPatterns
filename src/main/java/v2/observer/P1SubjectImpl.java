package v2.observer;

/**
 * Created by wangym on 2017/3/14.
 */
public class P1SubjectImpl extends Subject implements IMethod {
    public void doSomething() {
        System.out.println("P1 is doing something");
        super.notifyObservers();
    }
}
