package v2.observer;

import java.util.Vector;

/**
 * Created by wangym on 2017/3/14.
 */
public abstract class Subject {
    private Vector<Observer> observerVector = new Vector<>();

    public void addObserver(Observer o) {
        observerVector.add(o);
    }

    public void delObserver(Observer o) {
        observerVector.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observerVector) {
            o.update();
        }
    }

}
