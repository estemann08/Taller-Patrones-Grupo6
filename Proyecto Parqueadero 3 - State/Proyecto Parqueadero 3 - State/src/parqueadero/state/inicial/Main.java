package parqueadero.state.inicial;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- API Parqueadero: State (Versión Defectuosa) ---");
        
        EspacioParqueo espacio = new EspacioParqueo();

        // Simulamos acciones sobre el espacio de parqueo
        System.out.println("\nIntento 1: Ocupar el espacio");
        espacio.ocupar(); // Debería funcionar

        System.out.println("\nIntento 2: Ocupar otra vez");
        espacio.ocupar(); // Debería dar error

        System.out.println("\nIntento 3: Enviar a reparar mientras está ocupado");
        espacio.reparar(); // Debería dar error

        System.out.println("\nIntento 4: Liberar el espacio");
        espacio.liberar(); // Debería funcionar

        System.out.println("\nIntento 5: Enviar a mantenimiento");
        espacio.reparar(); // Debería funcionar

         System.out.println("\nIntento 6: Finalizar el mantenimiento");
        espacio.finalizarMantenimiento(); // Funciona y regresa a Disponible

        System.out.println("\nIntento 7: Ocupar el espacio de nuevo");
        espacio.ocupar(); // Funciona: el espacio ya no queda bloqueado
    }
    
}