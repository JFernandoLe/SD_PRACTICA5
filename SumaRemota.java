import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz remota
public interface SumaRemota extends Remote {
    int sumar(int a, int b) throws RemoteException;
}
