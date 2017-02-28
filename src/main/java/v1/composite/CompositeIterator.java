package v1.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by wangym on 2016/12/30.
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        boolean ret = false;
        if (stack.empty()) {
            ret = false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                ret = hasNext();
            } else {
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public MenuComponent next() {
        MenuComponent ret = null;
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if (menuComponent.isMenu()) {
                stack.push(menuComponent.createIterator());
            }
            ret = menuComponent;
        }
        return ret;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
