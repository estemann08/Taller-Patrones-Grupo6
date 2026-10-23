package parqueadero.strategy.implementado;

public class TarifaProfesor implements EstrategiaTarifa {
    @Override
    public double calcular(int horas) {
        return horas * 1500.0;
    }
}