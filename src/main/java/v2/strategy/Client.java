package v2.strategy;

/**
 * Created by wangym on 2017/3/7.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategyP1 = new P1StrategyImpl();
        Strategy strategyP2 = new P2StrategyImpl();
        Context context = new Context(strategyP1);
        context.doAnything();
        context.setStrategy(strategyP2);
        context.doAnything();
    }
}
