package v1.composite;

import java.util.Iterator;

/**
 * Created by wangym on 2016/12/30.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
