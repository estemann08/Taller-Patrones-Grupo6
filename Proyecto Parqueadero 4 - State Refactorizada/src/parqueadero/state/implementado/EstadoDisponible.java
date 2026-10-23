package parqueadero.state.implementado;

public class EstadoDisponible implements EstadoEspacio {
    @Override
    public void ocupar(EspacioParqueoContexto contexto) {
        System.out.println("El espacio ahora está ocupado.");
        contexto.setEstado(new EstadoOcupado()); // Transición de estado
    }

    @Override
    public void liberar(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio ya está disponible.");
    }

    @Override
    public void reparar(EspacioParqueoContexto contexto) {
        System.out.println("El espacio entra en mantenimiento.");
        contexto.setEstado(new EstadoMantenimiento()); // Transición de estado
    }

     @Override
    public void finalizarMantenimiento(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio no está en mantenimiento.");
    }
}