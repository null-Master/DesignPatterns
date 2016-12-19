package strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public interface QuackBehavior {
    default void quack() {
        System.out.println("我不会叫");
    }
//    void quack();
}
