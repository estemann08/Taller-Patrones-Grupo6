package parqueadero.state.implementado;

public class EstadoOcupado implements EstadoEspacio {
    @Override
    public void ocupar(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio ya está ocupado.");
    }

    @Override
    public void liberar(EspacioParqueoContexto contexto) {
        System.out.println("El espacio ha sido liberado.");
        contexto.setEstado(new EstadoDisponible()); // Transición de estado
    }

    @Override
    public void reparar(EspacioParqueoContexto contexto) {
        System.out.println("Error: No se puede reparar un espacio ocupado. Libérelo primero.");
    }

    @Override
    public void finalizarMantenimiento(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio no está en mantenimiento.");
    }
}