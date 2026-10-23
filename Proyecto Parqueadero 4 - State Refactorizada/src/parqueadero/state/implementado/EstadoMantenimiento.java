package parqueadero.state.implementado;

public class EstadoMantenimiento implements EstadoEspacio {
    @Override
    public void ocupar(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio está en mantenimiento, no se puede ocupar.");
    }

    @Override
    public void liberar(EspacioParqueoContexto contexto) {
        System.out.println("Error: No se puede liberar un espacio que está en mantenimiento.");
    }

    @Override
    public void reparar(EspacioParqueoContexto contexto) {
        System.out.println("Error: El espacio ya está en mantenimiento.");
    }

     @Override
    public void finalizarMantenimiento(EspacioParqueoContexto contexto) {
        System.out.println("El mantenimiento finalizó, el espacio está disponible.");
        contexto.setEstado(new EstadoDisponible()); // Transición de estado
}

}