package practicaadapter;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en metros: ");
        double metros = scanner.nextDouble();

        System.out.print("Ingrese la cantidad en pulgadas: ");
        double pulgadas = scanner.nextDouble();

        System.out.print("Ingrese la cantidad en yardas: ");
        double yardas = scanner.nextDouble();

        System.out.print("Ingrese la cantidad en centimetros: ");
        double centimetros = scanner.nextDouble();

        sistemaDePies pies = new sistemaDePies();
        
        target adaptadorM = new adaptadorMetros(pies);
        target adaptadorP = new adaptadorPulgadas(pies);
        target adaptadorY = new adaptadorYardas(pies);
        target adaptadorC = new adaptadorCentimetros(pies);
        
        adaptadorM.convertirMedida(metros);
        adaptadorP.convertirMedida(pulgadas);
        adaptadorY.convertirMedida(yardas);
        adaptadorC.convertirMedida(centimetros);

    }
    
}
