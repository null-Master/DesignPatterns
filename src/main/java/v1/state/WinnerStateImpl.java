package v1.state;

/**
 * Created by wangym on 2017/1/5.
 */
public class WinnerStateImpl implements State {
    GumballMachine gumballMachine;

    public WinnerStateImpl(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No Way(insertQuarter)");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No Way(ejectQuarter)");
    }

    @Override
    public void turnCrank() {
        System.out.println("No Way(turnCrank)");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
