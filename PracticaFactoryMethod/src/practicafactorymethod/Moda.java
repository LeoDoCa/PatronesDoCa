package practicafactorymethod;

public class Moda extends Operaciones{

    @Override
    Calculadora crearCalculadora() {
        return new CalcularModa();
    }
    
}
