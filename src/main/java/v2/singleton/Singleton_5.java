package v2.singleton;

/**
 * Created by wangym on 2016/2/27.
 */


/**
 * 利用静态内部类实现 线程安全  延迟实例化
 *
 */
public class Singleton_5 {
    private static class SingletonHolder {
        private static final Singleton_5 INSTANCE = new Singleton_5();
    }
    private Singleton_5() {};
    public static final Singleton_5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
