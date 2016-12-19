package strategy;

/**
 * Created by wangym on 2016/12/19.
 */
public abstract class Duck {
    FlyBehavior fly;
    QuackBehavior quack;
    public void performQuack() {
        quack.quack();
    }
    public void performFly() {
        fly.fly();
    }
    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }
    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }
//    public abstract void test();
}
