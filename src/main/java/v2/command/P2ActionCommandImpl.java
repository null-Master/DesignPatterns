package v2.command;

/**
 * Created by wangym on 2017/2/28.
 */
public class P2ActionCommandImpl extends Command {
    private Receiver receiver;

    public P2ActionCommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
