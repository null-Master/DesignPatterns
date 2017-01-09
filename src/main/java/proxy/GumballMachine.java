package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wangym on 2017/1/4.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private String location;
    private int count;
    private String state;

    public GumballMachine(String location, int count, String state) throws RemoteException {
        this.location = location;
        this.count = count;
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        return state;
    }
}
