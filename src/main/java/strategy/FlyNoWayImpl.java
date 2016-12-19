package strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public class FlyNoWayImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("并不能飞");
    }
}
