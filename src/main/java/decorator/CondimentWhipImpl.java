package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class CondimentWhipImpl extends Condiment {
    public CondimentWhipImpl(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
