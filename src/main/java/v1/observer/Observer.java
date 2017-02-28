package v1.observer;

/**
 * Created by wangym on 2016/12/19.
 */
public interface Observer {
    void update(Subject subject, int temperature, int humidity, int pressure);
}
