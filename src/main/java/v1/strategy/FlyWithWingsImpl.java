package v1.strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public class FlyWithWingsImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我可以用翅膀飞行");
    }
}
