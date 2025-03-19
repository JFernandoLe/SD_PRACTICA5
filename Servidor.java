import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            // Iniciar el registro RMI en el puerto 1099
            LocateRegistry.createRegistry(1099);

            // Crear la instancia del objeto remoto
            SumaRemotaImpl suma = new SumaRemotaImpl();

            // Publicar el objeto en el registro RMI con un nombre identificador
            Naming.rebind("rmi://localhost/SumaRemota", suma);

            System.out.println("Servidor RMI listo...");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
