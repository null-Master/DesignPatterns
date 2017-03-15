package v2.adapter;

/**
 * Created by wangym on 2017/3/8.
 */
public class Client {
    public static void main(String[] args) {
        Target speTarget = new Adapter();
        speTarget.doSomething();
    }
}
