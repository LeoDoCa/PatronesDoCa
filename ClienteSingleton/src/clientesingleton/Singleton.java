package clientesingleton;

public class Singleton {
    
    private static Singleton unica_instancia;
    
    public static Singleton getInstancia() {
        // si la instancia no ha sido creada aún, se crea una nueva
        if (unica_instancia == null) {
            unica_instancia = new Singleton();
        }
        // retorna la instancia
        return unica_instancia;
    }

    // constructor privado para evitar instanciación desde fuera de la clase
    private Singleton() {
    }
    
}
