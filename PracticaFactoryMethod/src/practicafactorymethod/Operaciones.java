package practicafactorymethod;

public abstract class Operaciones {
    private Calculadora calculadora;
    
    abstract Calculadora crearCalculadora();
    
    public void realizarCalculo(double[] datos) {
        this.calculadora = crearCalculadora();
        this.calculadora.calcular(datos);
    }

    public Operaciones() {
    }
}
