import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import decorator.Beverage;
import decorator.BeverageEspressoImpl;
import decorator.CondimentMochaImpl;
import decoratortest.CondimentSoympl;
import factoryMethod.*;
import observer.CurrentConditionsDisplay;
import observer.NowConditionsDisplay;
import observer.WeatherDataSubjectImpl;
import strategy.Duck;
import strategy.DuckRealImpl;
import strategy.FlyNoWayImpl;
import strategy.QuackSqueakImpl;

/**
 * Created by wangym on 2016/12/19.
 */
public class Main {
    private static void strategy() {
        Duck duck = new DuckRealImpl();
        duck.performFly();
        duck.performQuack();

        duck.setFly(new FlyNoWayImpl());
        duck.setQuack(new QuackSqueakImpl());

        duck.performFly();
        duck.performQuack();
    }

    private static void observer() {
        WeatherDataSubjectImpl weatherData = new WeatherDataSubjectImpl();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        NowConditionsDisplay nowConditionsDisplay = new NowConditionsDisplay(weatherData);
        weatherData.setMeasurements(7, 7, 7);
        weatherData.setMeasurements(5, 5, 5);
        weatherData.setMeasurements(15, 15, 15);
    }

    private static void decorator() {
        Beverage beverage = new BeverageEspressoImpl();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new CondimentMochaImpl(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

    private static void decoratorTest() {
        decoratortest.Beverage beverage = new decoratortest.BeverageEspressoImpl();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage.addCondiment(new decoratortest.CondimentMochaImpl()).addCondiment(new CondimentSoympl());
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

    private static void factoreMethodPizza() {
        PizzaStore nyPizzaStore = PizzaStoreFactory.getPizzaStore(PizzaStoreLocation.NY);
        PizzaStore chiPizzaStore = PizzaStoreFactory.getPizzaStore(PizzaStoreLocation.CHICAGO);

        Pizza pizza = null;

        pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("");
        pizza = nyPizzaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("");

        pizza = chiPizzaStore.orderPizza(PizzaType.CHEESE);



    }

    public static void main(String[] args) {
//        strategy();
//        observer();
//        decorator();
//        decoratorTest();
        factoreMethodPizza();
    }
}
