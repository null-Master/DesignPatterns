package factoryMethod;

/**
 * Created by wangym on 2016/12/23.
 */
public class NYPizzaStoreImpl extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE: {
                pizza = new NYStyleCheesePizzaImpl();
                break;
            }
            case VEGGIE: {
                pizza = new NYStyleVeggiePizzaImpl();
                break;
            }
            default: pizza = null;
        }
        return pizza;
    }
}
