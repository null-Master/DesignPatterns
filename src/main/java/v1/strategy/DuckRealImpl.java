package v1.strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public class DuckRealImpl extends Duck {
    public DuckRealImpl () {
        quack = new QuackRealDuckImpl();
        fly = new FlyWithWingsImpl();
    }
}
