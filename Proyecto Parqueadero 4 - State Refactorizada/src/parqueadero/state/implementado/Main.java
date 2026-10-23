package parqueadero.state.implementado;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- API Parqueadero: State (Implementado) ---");
        
        EspacioParqueoContexto espacio = new EspacioParqueoContexto();

        System.out.println("\nIntento 1: Ocupar el espacio");
        espacio.ocupar(); // Funciona y cambia a Ocupado

        System.out.println("\nIntento 2: Ocupar otra vez");
        espacio.ocupar(); // Da error porque ya está ocupado

        System.out.println("\nIntento 3: Enviar a reparar mientras está ocupado");
        espacio.reparar(); // Da error

        System.out.println("\nIntento 4: Liberar el espacio");
        espacio.liberar(); // Funciona y regresa a Disponible

        System.out.println("\nIntento 5: Enviar a mantenimiento");
        espacio.reparar(); // Funciona y pasa a Mantenimiento
    }
}