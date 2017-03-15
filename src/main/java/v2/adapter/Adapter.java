package v2.adapter;

/**
 * Created by wangym on 2017/3/8.
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void doSomething() {
        super.doAnything();
    }
}
