package parqueadero.strategy.inicial;

public class CalculadoraTarifa {
   // aqui identificamos el tipo de usuario
    public static final int ESTUDIANTE = 1;
    public static final int PROFESOR = 2;
    public static final int VISITANTE = 3;

    public double calcularTotal(int tipoUsuario, int horas) {
        double total = 0;
        
        // la lógica matemática está acoplada aquí en este switch (el ddefecto)
        switch (tipoUsuario) {
            case ESTUDIANTE:
                total = horas * 1000.0;
                break;
            case PROFESOR:
                total = horas * 1500.0;
                break;
            case VISITANTE:
                total = horas * 3000.0;
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
                break;
        }
        return total;
    }
}

