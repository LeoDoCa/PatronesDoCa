package calculadorasingleton;

import java.util.Arrays;

public class estadisticasSingleton {
    
    private static estadisticasSingleton instancia;
    
    private estadisticasSingleton() {
    }

    public static estadisticasSingleton getInstancia() {
        if (instancia == null) {
            instancia = new estadisticasSingleton();
        }

        return instancia;
    }

    public double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }

    public double calcularModa(double[] numeros) {
        double moda = numeros[0];
        int maxFrec = 0;
        int frecActual;

        for (double numero : numeros) {
            frecActual = 0;
            for (double num : numeros) {
                if (numero == num) {
                    frecActual++;
                }
            }
           
            if (frecActual > maxFrec) {
                maxFrec = frecActual;
                moda = numero;
            }
        }

        return moda;
    }

    public double calcularMediana(double[] numeros) {
        Arrays.sort(numeros);
        int longitud = numeros.length;
        
        if (longitud % 2 == 0) {
            return (numeros[longitud/2-1] + numeros[longitud/2]) / 2;
        } 
        return 0;
    }
}
