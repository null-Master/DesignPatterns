package v1.strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public class QuackRealDuckImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我可以正常的叫");
    }
}
