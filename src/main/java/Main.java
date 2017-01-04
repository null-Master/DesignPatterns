import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import composite.MenuComponent;
import composite.MenuItemMenuComponentImpl;
import composite.MenuMenuComponentImpl;
import composite.Waitress;
import decorator.Beverage;
import decorator.BeverageEspressoImpl;
import decorator.CondimentMochaImpl;
import decoratortest.CondimentSoympl;
import factoryMethod.*;
import observer.CurrentConditionsDisplay;
import observer.NowConditionsDisplay;
import observer.WeatherDataSubjectImpl;
import state.GumballMachine;
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

    public static void composite() {
        MenuComponent pancakeHouseMenu =
                new MenuMenuComponentImpl("PANCAKE HOUSE MENU", "Breakfase");
        MenuComponent dinerMenu =
                new MenuMenuComponentImpl("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new MenuMenuComponentImpl("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new MenuMenuComponentImpl("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new MenuMenuComponentImpl("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItemMenuComponentImpl(
               "Pasta", "a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItemMenuComponentImpl(
                "Apple pie", "Apple pie with a flakey crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();

        waitress.printVegetarianMenu();
    }

    public static void State () {
        GumballMachine gumballMachine = new GumballMachine(10);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }


    public static void main(String[] args) {
//        strategy();
//        observer();
//        decorator();
//        decoratorTest();
//        factoreMethodPizza();
//        composite();
        State();
    }
}
