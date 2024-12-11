package practicaadapter;

public class adaptadorPulgadas implements target {

    private sistemaDePies pies;

    public adaptadorPulgadas(sistemaDePies pies) {
        this.pies = pies;
    }
    
    @Override
    public void convertirMedida(double medida) {
        double convMedida = medida / 12;
        pies.procesarMedida(convMedida);
    }
    
}
