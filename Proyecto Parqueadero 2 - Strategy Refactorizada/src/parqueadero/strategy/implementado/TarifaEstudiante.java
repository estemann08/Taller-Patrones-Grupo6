package parqueadero.strategy.implementado;

public class TarifaEstudiante implements EstrategiaTarifa {
    @Override
    public double calcular(int horas) {
        return horas * 1000.0;
    }
}