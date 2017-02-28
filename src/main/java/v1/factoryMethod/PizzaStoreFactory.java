package v1.factoryMethod;

/**
 * Created by wangym on 2016/12/23.
 */
public class PizzaStoreFactory {
    private static PizzaStore nyPizzaStoreImpl = new NYPizzaStoreImpl();
    private static PizzaStore chicagoStoreImpl = new ChicagePizzaStoreImpl();

    public static PizzaStore getPizzaStore (PizzaStoreLocation location) {
        PizzaStore pizzaStore;
        switch (location) {
            case NY: {
                pizzaStore = nyPizzaStoreImpl;
                break;
            }
            case CHICAGO: {
                pizzaStore = chicagoStoreImpl;
                break;
            }
            default: pizzaStore = null;
        }
        return pizzaStore;
    }
}
