package parqueadero.state.implementado;

public class EspacioParqueoContexto {
    private EstadoEspacio estadoActual;

    public EspacioParqueoContexto() {
        // Arranca por defecto en estado disponible
        this.estadoActual = new EstadoDisponible();
    }

    public void setEstado(EstadoEspacio nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Delegamos las acciones al estado actual, sin usar switch
    public void ocupar() {
        estadoActual.ocupar(this);
    }

    public void liberar() {
        estadoActual.liberar(this);
    }

    public void reparar() {
        estadoActual.reparar(this);
    }
}