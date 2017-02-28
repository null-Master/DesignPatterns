package v2.singleton;

/**
 * Created by wangym on 2016/2/27.
 */

/**
 * 最简单的 线程不安全的 延迟实例化
 */

public class Singleton_1 {
    private static Singleton_1 instance;
    private Singleton_1 () {};
    public static Singleton_1 getInstance() {
        if (instance == null) {
            instance =  new Singleton_1();
        }
        return instance;
    }
}
