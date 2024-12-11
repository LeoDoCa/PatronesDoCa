package calculadorasingleton;

import java.util.Scanner;

public class CalculadoraSingleton {


    public static void main(String[] args) {
        
        estadisticasSingleton calculadora = estadisticasSingleton.getInstancia();

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.println("Estas por escribir el ultimo numero");
            }
            numeros[i] = sc.nextDouble();
        }
        
        System.out.println("Promedio: " + calculadora.calcularPromedio(numeros));
        System.out.println("Moda: " + calculadora.calcularModa(numeros));
        System.out.println("Mediana: " + calculadora.calcularMediana(numeros));
    }
    
}
