package parqueadero.strategy.inicial;

public class Main {
    public static void main(String[] args) {
        //Instanciamos la clase que tiene el defecto de diseño
        CalculadoraTarifa calculadora = new CalculadoraTarifa();
        
        System.out.println("--- API Parqueadero: Strategy (Versión Inicial) ---");
        
        //Simulamcion al cobro a un estudiante por 4 horas
        double cobroEstudiante = calculadora.calcularTotal(CalculadoraTarifa.ESTUDIANTE, 4);        
        System.out.println("Total estudiante (4 horas): $" + cobroEstudiante);
        
        //Simulacion al cobro a un visitante por 2 horas
       double cobroVisitante = calculadora.calcularTotal(CalculadoraTarifa.VISITANTE, 2);
        System.out.println("Total visitante (2 horas): $" + cobroVisitante);
    }
}
