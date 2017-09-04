import ar.edu.itba.pod.rmi.def.e4.GenericService;
import ar.edu.itba.pod.rmi.def.e4.GenericServiceImpl;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// Server
public class Main {

    public static void main(final String[] args) throws RemoteException {
        System.out.println("rmi-definitions Server Starting ...");
        final GenericService gs = new GenericServiceImpl();
        final Remote remote = UnicastRemoteObject.exportObject(gs, 0);

        final Registry registry = LocateRegistry.getRegistry();
        registry.rebind("service", remote);
        System.out.println("Service bound");
    }
}
