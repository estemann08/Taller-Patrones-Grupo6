package parqueadero.strategy.implementado;

public class Ticket {
    // El ticket "tiene una" estrategia de cobro asignada
    private EstrategiaTarifa estrategia;

    // Al crear el ticket, le decimos qué tarifa usar (ej: TarifaEstudiante)
    public Ticket(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    // Este método permite cambiar la tarifa en cualquier momento
    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    // El ticket delega el cálculo, ya no tiene un switch
    public double cobrar(int horas) {
        return estrategia.calcular(horas);
    }
}