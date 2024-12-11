package practicafactorymethod;

public class CalcularModa implements Calculadora{

    @Override
    public void calcular(double[] datos) {
        double moda = datos[0];
        int maxFrec = 0;
        int frecActual;

        for (double numero : datos) {
            frecActual = 0;
            for (double num : datos) {
                if (numero == num) {
                    frecActual++;
                }
            }
            if (frecActual > maxFrec) {
                maxFrec = frecActual;
                moda = numero;
            }
        }
        System.out.println("La moda es: " + moda);
    }
    
}
