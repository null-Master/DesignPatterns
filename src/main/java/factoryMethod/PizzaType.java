package factoryMethod;

import java.util.StringJoiner;

/**
 * Created by wangym on 2016/12/23.
 */
public enum PizzaType {
    CHEESE("cheese"),
    VEGGIE("veggie");
    private String type;

    PizzaType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("type = " + type)
                .toString();
    }
}
