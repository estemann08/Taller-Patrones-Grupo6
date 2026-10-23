package parqueadero.state.inicial;

public class EspacioParqueo {
    // El defecto: Controlamos el estado con un simple texto y muchos switch
    private String estado = "DISPONIBLE"; 

    public void ocupar() {
        switch (estado) {
            case "DISPONIBLE":
                System.out.println("El espacio ahora está ocupado.");
                estado = "OCUPADO";
                break;
            case "OCUPADO":
                System.out.println("Error: El espacio ya está ocupado.");
                break;
            case "MANTENIMIENTO":
                System.out.println("Error: El espacio está en mantenimiento, no se puede ocupar.");
                break;
        }
    }

    public void liberar() {
        switch (estado) {
            case "DISPONIBLE":
                System.out.println("Error: El espacio ya está disponible.");
                break;
            case "OCUPADO":
                System.out.println("El espacio ha sido liberado.");
                estado = "DISPONIBLE";
                break;
            case "MANTENIMIENTO":
                System.out.println("Error: No se puede liberar un espacio que está en mantenimiento.");
                break;
        }
    }

    public void reparar() {
        switch (estado) {
            case "DISPONIBLE":
                System.out.println("El espacio entra en mantenimiento.");
                estado = "MANTENIMIENTO";
                break;
            case "OCUPADO":
                System.out.println("Error: No se puede reparar un espacio ocupado. Libérelo primero.");
                break;
            case "MANTENIMIENTO":
                System.out.println("Error: El espacio ya está en mantenimiento.");
                break;
        }
    }
     public void finalizarMantenimiento() {
        switch (estado) {
            case "DISPONIBLE":
            case "OCUPADO":
                System.out.println("Error: El espacio no está en mantenimiento.");
                break;
            case "MANTENIMIENTO":
                System.out.println("El mantenimiento finalizó, el espacio está disponible.");
                estado = "DISPONIBLE";
                break;
        }
    }
}