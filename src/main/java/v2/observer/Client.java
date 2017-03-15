package v2.observer;

/**
 * Created by wangym on 2017/3/14.
 */
public class Client {
    public static void main(String[] args) {
        P1SubjectImpl p1 = new P1SubjectImpl();
        Observer obs = new ObserverImpl();
        p1.addObserver(obs);
        p1.doSomething();
    }
}
