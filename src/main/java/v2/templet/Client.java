package v2.templet;

/**
 * Created by wangym on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass p1 = new P1AbstractClassImpl();
        AbstractClass p2 = new P2AbstractClassImpl();

        p1.templetMethod();
        p2.templetMethod();
    }
}
