package factoryMethod;

/**
 * Created by wangym on 2016/12/23.
 */
public class ChicagePizzaStoreImpl extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE: {
                pizza = new ChicagoStyleCheesePizzaImpl();
                break;
            }
            case VEGGIE: {
                pizza = new ChicagoStyleVeggiePizzaImpl();
                break;
            }
            default: pizza = null;
        }
        return pizza;
    }
}
