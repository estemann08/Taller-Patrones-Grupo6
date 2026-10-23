package parqueadero.strategy.implementado;

public class TarifaVisitante implements EstrategiaTarifa {
    @Override
    public double calcular(int horas) {
        return horas * 3000.0;
    }
}