package v1.singleton;

/**
 * Created by wangym on 2016/12/26.
 */

/**
 * 线程安全 急切实例化 无论是否使用 必定会实例化一个对象
 */
public class Singleton_4 {
    private static final Singleton_4 INSTANCE = new Singleton_4();
    private Singleton_4() {};

    public static Singleton_4 getInstance() {
        return INSTANCE;
    }

}
