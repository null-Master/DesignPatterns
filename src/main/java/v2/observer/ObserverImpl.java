package v2.observer;

/**
 * Created by wangym on 2017/3/14.
 */
public class ObserverImpl implements Observer {
    @Override
    public void update() {
        System.out.println("receive");
    }
}
