/**
 * Created by wangym on 2017/3/14.
 */
public class Client {
    public void doA(A a) {
        System.out.println("A");
    }
    public void doA(A1Impl a) {
        System.out.println("A1");
    }
    public void doA(A2Impl a) {
        System.out.println("A2");
    }

    public static void main(String[] args) {
        A a1 = new A1Impl();
        A a2 = new A2Impl();
        A1Impl a11 = (A1Impl) a1;
        Client c = new Client();
        c.doA(a1);
        c.doA(a2);
        c.doA(a11);
    }
}

//重载在编译时期，根据变量的表面类型就已经决定了该选择哪个方法来执行         静态绑定  static private final 构造函数
//而多态在运行时期，根据变量的实际类型来决定选择哪个方法来执行  动态绑定