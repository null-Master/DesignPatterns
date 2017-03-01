package v2.command;

/**
 * Created by wangym on 2017/2/28.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doAction() {
        this.command.execute();
    }
}
