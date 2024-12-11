package practicaadapter;

public class adaptadorCentimetros implements target {

    private sistemaDePies pies;

    public adaptadorCentimetros(sistemaDePies pies) {
        this.pies = pies;
    }
    
    @Override
    public void convertirMedida(double medida) {
        double convMedida = medida * 0.0328084;
        pies.procesarMedida(convMedida);
    }
    
}
