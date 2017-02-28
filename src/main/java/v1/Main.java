package v1;

import v1.composite.MenuComponent;
import v1.composite.MenuItemMenuComponentImpl;
import v1.composite.MenuMenuComponentImpl;
import v1.composite.Waitress;
import v1.decorator.Beverage;
import v1.decorator.BeverageEspressoImpl;
import v1.decorator.CondimentMochaImpl;
import v1.decoratortest.CondimentSoympl;
import v1.observer.CurrentConditionsDisplay;
import v1.observer.NowConditionsDisplay;
import v1.observer.WeatherDataSubjectImpl;
import v1.state.GumballMachine;
import v1.strategy.Duck;
import v1.strategy.DuckRealImpl;
import v1.strategy.FlyNoWayImpl;
import v1.strategy.QuackSqueakImpl;

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
//        v1.strategy();
//        v1.observer();
//        v1.decorator();
//        decoratorTest();
//        factoreMethodPizza();
//        v1.composite();
        State();
    }
}
