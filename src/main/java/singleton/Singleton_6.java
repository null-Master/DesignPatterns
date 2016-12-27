package singleton;

/**
 * Created by wangym on 2016/12/27.
 */

//http://www.cnblogs.com/liaokailin/p/3196253.html
public enum Singleton_6 {
    INSTANCE;

    private SingletonInEnum getInstance;

    private Singleton_6() {
        //do something
        getInstance = new SingletonInEnum();
    }



}
