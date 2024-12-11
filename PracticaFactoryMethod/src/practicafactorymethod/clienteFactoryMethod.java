package practicafactorymethod;
import java.util.Scanner;

public class clienteFactoryMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int n = sc.nextInt();
        double[] datos = new double[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            datos[i] = sc.nextDouble();
        }
        
        Operaciones promedio = new Promedio();
        Operaciones moda = new Moda();
        Operaciones mediana = new Mediana();

        promedio.realizarCalculo(datos);
        moda.realizarCalculo(datos);
        mediana.realizarCalculo(datos);
    }
    
}
