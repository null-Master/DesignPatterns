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

    public static void main(String[] args) {
//        strategy();
        observer();
    }
}
