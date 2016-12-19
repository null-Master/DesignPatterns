package strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public interface FlyBehavior {
    default void fly() {
        System.out.println("我不会飞");
    }
//    void fly();
}
