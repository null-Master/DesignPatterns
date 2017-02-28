package v2.singleton;

/**
 * Created by wangym on 2016/2/27.
 */

/**
 * 延迟实例化  双重检查 线程安全 同步消耗小
 * volatile 关键字是为了避免jvm自动优化 指令重排序
 *
 */
public class Singleton_3 {
    private static volatile Singleton_3 instance;
    private Singleton_3() {};
    public static Singleton_3 getInstance () {
        if (instance == null) {
            synchronized (Singleton_3.class) {
                if (instance == null) {
                    instance = new Singleton_3();
                }
            }
        }
        return instance;
    }
}
