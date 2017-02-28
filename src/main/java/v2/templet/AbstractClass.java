package v2.templet;

/**
 * Created by wangym on 2017/2/27.
 */
public abstract class AbstractClass {
    // basic methods
    protected abstract void doSomething();
    protected abstract void doSomethind2();

    private void doSameThing() {
        System.out.println("I am doing the same thing.");
    }

    public final void templetMethod() {
        doSomething();
        doSameThing();
        doSomethind2();
    }
}
