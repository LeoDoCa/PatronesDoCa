package practicafactorymethod;
import java.util.Arrays;
public class CalcularMediana implements Calculadora{

    @Override
    public void calcular(double[] datos) {
        Arrays.sort(datos);
        int longitud = datos.length;
        double mediana;

        if (longitud % 2 == 0) {
            mediana = (datos[longitud / 2 - 1] + datos[longitud / 2]) / 2;
        } else {
            mediana = datos[longitud / 2];
        }
        System.out.println("La mediana es: " + mediana);
    }
    
}
