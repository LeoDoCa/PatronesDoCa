package practicaadapter;

public class adaptadorMetros implements target {

    private sistemaDePies pies;

    public adaptadorMetros(sistemaDePies pies) {
        this.pies = pies;
    }
    
    @Override
    public void convertirMedida(double medida) {
        double convMedida = medida * 3.28084;
        pies.procesarMedida(convMedida);
    }
    
}
