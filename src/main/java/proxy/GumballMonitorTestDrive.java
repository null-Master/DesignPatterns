package proxy;

import java.rmi.Naming;

/**
 * Created by wangym on 2017/1/5.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String [] location = {
                "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"
        };
        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machineRemote);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++) {
            monitors[i].report();
        }

    }
}
