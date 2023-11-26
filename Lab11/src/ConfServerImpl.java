import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ConfServerImpl extends UnicastRemoteObject implements
        ConfServer {
    // Определяется конструктор по умолчанию
    public ConfServerImpl() throws RemoteException {
        super();
    }

    // Определение удаленного метода
    @Override
    public int registerConfParticipant(RegistrationInfo
                                               participant)
            throws RemoteException {
        try {
            DbHandler dbh = DbHandler.getInstance();
            dbh.addParticipant(participant);
            return dbh.getParticipantCount();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException(e.getMessage(), e);
        }
    }

    // Метод main()
    public static void main(String[] args) {
        try {
            // Установка параметра адреса сервера (чтобы избежать ошибки создания сервера на локальной машине)
            System.setProperty("java.rmi.server.hostname",
                    InetAddress.getLocalHost().getHostAddress());
            // Создание RMI регистра
            LocateRegistry.createRegistry(1099);
            // Создание экземпляра класса ConfServerImpl
            ConfServerImpl instance = new ConfServerImpl();
            // Регистрация объекта RMI под именем ConfServer
            Naming.rebind("ConfServer", instance);
            System.out.println("Сервис зарегистрирован");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
