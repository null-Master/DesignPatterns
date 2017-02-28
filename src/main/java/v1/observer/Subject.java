package v1.observer;

/**
 * Created by wangym on 2016/12/19.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
