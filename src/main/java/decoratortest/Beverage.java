package decorator;

/**
 * Created by wangym on 2016/12/22.
 */
public abstract class Beverage {
    protected String description = "Unkonwn Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
