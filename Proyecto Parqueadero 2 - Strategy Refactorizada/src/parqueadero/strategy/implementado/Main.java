package parqueadero.strategy.implementado;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- API Parqueadero: Strategy (Implementado) ---");

        // 1. Cobro a estudiante: Le pasamos la estrategia TarifaEstudiante al ticket
        Ticket ticketEstudiante = new Ticket(new TarifaEstudiante());
        System.out.println("Total estudiante (4 horas): $" + ticketEstudiante.cobrar(4));

        // 2. Cobro a visitante: Le pasamos la estrategia TarifaVisitante
        Ticket ticketVisitante = new Ticket(new TarifaVisitante());
        System.out.println("Total visitante (2 horas): $" + ticketVisitante.cobrar(2));
        
        // 3. Demostración de flexibilidad (la ventaja de este patrón)
        // Imagina que el visitante muestra su carnet de profesor al momento de pagar.
        // Solo cambiamos la estrategia en el mismo ticket, sin crear uno nuevo.
        ticketVisitante.setEstrategia(new TarifaProfesor());
        System.out.println("Total visitante actualizado a profesor (2 horas): $" + ticketVisitante.cobrar(2));
    }
}