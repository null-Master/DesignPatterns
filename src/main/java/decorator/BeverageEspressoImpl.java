package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 0;
    }
}
