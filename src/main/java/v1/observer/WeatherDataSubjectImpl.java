package v1.observer;

import java.util.HashSet;

/**
 * Created by wangym on 2016/12/19.
 */
public class WeatherDataSubjectImpl implements Subject {
    private HashSet<Observer> observers;//默认通过equal方法比较 类的equal是比较引用地址 不需要重写
    private int temperature = 0;
    private int humidity = 0;
    private int pressure = 0;
    private boolean changed = false;

    public WeatherDataSubjectImpl() {
        observers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer: observers) {
                observer.update(this, temperature, humidity, pressure);
            }
        }
        changed = false;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        if (Math.abs(temperature - this.temperature) > 5) {
            setChanged();
        }
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    private void setChanged() {
        changed = true;
    }


    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
