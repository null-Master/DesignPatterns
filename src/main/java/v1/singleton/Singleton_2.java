package v1.singleton;

/**
 * Created by wangym on 2016/12/26.
 */


/**
 * 线程安全 延迟实例化 同步消耗高
 */
public class Singleton_2 {
    private static Singleton_2 instance;
    private Singleton_2() {};
    public synchronized static Singleton_2 getInstance () {
        if (instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }
}
