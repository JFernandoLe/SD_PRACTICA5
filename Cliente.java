import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Buscar el objeto remoto en el registro
            SumaRemota suma = (SumaRemota) Naming.lookup("rmi://localhost/SumaRemota");

            // Llamar al método remoto
            int resultado = suma.sumar(5, 3);
            System.out.println("Resultado de la suma: " + resultado);
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
