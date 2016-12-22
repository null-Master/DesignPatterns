package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class BeverageEspressoImpl extends Beverage {
    public BeverageEspressoImpl() {
        description = "BeverageEspressoImpl";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
