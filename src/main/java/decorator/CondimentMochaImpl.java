package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class CondimentMochaImpl extends Condiment {

    public CondimentMochaImpl(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
