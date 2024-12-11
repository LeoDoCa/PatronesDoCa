package practicaadapter;

public class adaptadorYardas implements target {

    private sistemaDePies pies;

    public adaptadorYardas(sistemaDePies pies) {
        this.pies = pies;
    }
    
    @Override
    public void convertirMedida(double medida) {
        double convMedida = medida * 3;
        pies.procesarMedida(convMedida);
    }
    
}
