package v1.factoryMethod;

/**
 * Created by wangym on 2016/12/23.
 */
public abstract class Pizza {
    protected String name;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println(name + " prepare.");
    }
    public void bake() {
        System.out.println(name + " bake.");
    }
    public void cut() {
        System.out.println(name + " cut.");
    }
    public void box() {
        System.out.println(name + " box.");
    }

}
