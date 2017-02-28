package v1.factoryMethod;

/**
 * Created by wangym on 2016/12/23.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;

    }
}
