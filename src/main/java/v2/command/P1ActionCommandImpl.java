package v2.command;

/**
 * Created by wangym on 2017/2/28.
 */
public class P1ActionCommandImpl extends Command {
    private Receiver receiver;

    public P1ActionCommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
