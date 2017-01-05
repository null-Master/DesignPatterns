package state;

import javax.swing.plaf.basic.BasicScrollPaneUI;

/**
 * Created by wangym on 2017/1/4.
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutStateImpl(this);
        noQuarterState = new NoQuarterStateImpl(this);
        hasQuarterState = new HasQuarterStateImpl(this);
        soldState = new SoldStateImpl(this);
        winnerState = new WinnerStateImpl(this);
        this.count = count;
        state = count > 0 ? noQuarterState : soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "{\"GumballMachine\":{"
                + "\"state\":\"" + state + "\""
                + ",\"count\":\"" + count + "\""
                + "}}";
    }
}
