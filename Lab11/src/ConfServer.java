//import client.RegistrationInfo;

import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public interface ConfServer extends Remote {
    int registerConfParticipant(RegistrationInfo registrationInfo)throws RemoteException;
}
