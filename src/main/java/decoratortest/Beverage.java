package decoratortest;

/**
 * Created by wangym on 2016/12/22.
 */
public abstract class Beverage {
    protected String description = "Unkonwn Beverage";
    protected double cost;

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return this.cost;
    }
    public Beverage addCondiment (Beverage beverage) {
        this.cost += beverage.cost;
        this.description = this.description + ", " + beverage.getDescription();
        return this;
    }
}
