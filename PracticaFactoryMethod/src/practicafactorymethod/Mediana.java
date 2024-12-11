package practicafactorymethod;

public class Mediana extends Operaciones{

    @Override
    Calculadora crearCalculadora() {
        return new CalcularMediana();
    }
    
}
