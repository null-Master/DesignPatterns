package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wangym on 2017/1/5.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public String getState() throws RemoteException;
}
