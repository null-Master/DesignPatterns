package state;

/**
 * Created by wangym on 2017/1/5.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
