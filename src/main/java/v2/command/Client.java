package v2.command;



/**
 * Created by wangym on 2017/2/28.
 */

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new P1ActionCommandImpl(new P1ReceiverImpl());
        invoker.setCommand(command);
        invoker.doAction();
        System.out.println("wait...");
        command = new P2ActionCommandImpl(new P2ReceiverImpl());
        invoker.setCommand(command);
        invoker.doAction();
    }
}

