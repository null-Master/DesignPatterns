package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class CondimentSoyImpl extends Condiment {

    public CondimentSoyImpl(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
