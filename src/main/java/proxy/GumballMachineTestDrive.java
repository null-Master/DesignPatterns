package proxy;

import java.rmi.Naming;

/**
 * Created by wangym on 2017/1/5.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachineRemote = new GumballMachine(args[0], count, "ready");
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
