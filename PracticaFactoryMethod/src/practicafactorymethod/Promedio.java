package practicafactorymethod;

public class Promedio extends Operaciones{

    @Override
    Calculadora crearCalculadora() {
        return new CalcularPromedio();
    }
    
}
