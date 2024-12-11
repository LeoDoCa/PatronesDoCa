package practicafactorymethod;

public class CalcularPromedio implements Calculadora{

    @Override
    public void calcular(double[] datos) {
        double suma = 0;
        for (double numero : datos) {
            suma += numero;
        }
        double promedio = suma / datos.length;
        System.out.println("El promedio es: " + promedio);
    }
    
}
