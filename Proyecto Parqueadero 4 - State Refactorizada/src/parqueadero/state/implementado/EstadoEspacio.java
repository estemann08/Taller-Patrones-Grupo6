package parqueadero.state.implementado;

public interface EstadoEspacio {
    void ocupar(EspacioParqueoContexto contexto);
    void liberar(EspacioParqueoContexto contexto);
    void reparar(EspacioParqueoContexto contexto);
    void finalizarMantenimiento(EspacioParqueoContexto contexto);
}