package v1.observer;

/**
 * Created by wangym on 2016/12/19.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private int temperature;
    private int humidity;
    private int pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subject, int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees, " + humidity + "% humitidy, " + pressure + "P");
    }
}
