package v1.factoryMethod;

import java.util.StringJoiner;

/**
 * Created by wangym on 2016/12/23.
 */
public enum PizzaStoreLocation {
    NY("New York"),
    CHICAGO("Chicago");
    private String location;

    PizzaStoreLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("location = " + location)
                .toString();
    }
}
