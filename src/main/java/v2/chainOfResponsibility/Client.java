package v2.chainOfResponsibility;

/**
 * Created by wangym on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        Handler p1 = new P1HandlerImpl();
        Handler p2 = new P2HandlerImpl();
        Handler p3 = new P3HandlerImpl();
        p1.setNextHandler(p2);
        p2.setNextHandler(p3);
        Response response = p1.handleMessage(new Request());
    }
}
