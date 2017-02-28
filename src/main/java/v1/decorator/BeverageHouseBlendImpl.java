package v1.decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class BeverageHouseBlendImpl extends Beverage {
    public BeverageHouseBlendImpl() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
