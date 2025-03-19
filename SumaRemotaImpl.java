import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementación de la interfaz remota
public class SumaRemotaImpl extends UnicastRemoteObject implements SumaRemota {
    
    // Constructor que lanza RemoteException
    protected SumaRemotaImpl() throws RemoteException {
        super();
    }

    // Implementación del método sumar
    @Override
    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }
}
