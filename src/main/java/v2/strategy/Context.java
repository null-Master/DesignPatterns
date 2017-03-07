package v2.strategy;

/**
 * Created by wangym on 2017/3/7.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        strategy.doSomething();
    }
}
