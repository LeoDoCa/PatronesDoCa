package clientesingleton;

public class ThreadSafeSingleton {
     // variable privada y estática que contendrá la única instancia de la clase.
    private static volatile ThreadSafeSingleton unica_instancia;
    
    public static ThreadSafeSingleton getUnica_instancia() {
        // se usa synchronized para asegurar que solo un hilo pueda acceder a esta sección crítica.
        synchronized (ThreadSafeSingleton.class) {
            // se crea una instancia solo si no ha sido creada previamente
            if (unica_instancia == null) {
                unica_instancia = new ThreadSafeSingleton();
            }
        }
        // retorna la única instancia
        return unica_instancia;
    }

    // constructor privado para evitar instanciación desde fuera de la clase
    private ThreadSafeSingleton() {
    }
}
