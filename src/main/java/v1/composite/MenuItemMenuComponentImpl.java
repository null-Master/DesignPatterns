package v1.composite;

import java.util.Iterator;

/**
 * Created by wangym on 2016/12/30.
 */
public class MenuItemMenuComponentImpl extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItemMenuComponentImpl(String name, String description,
                                     boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.printf("   --- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
