package v1.decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public abstract class Condiment extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
