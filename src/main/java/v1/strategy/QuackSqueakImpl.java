package v1.strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public class QuackSqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
