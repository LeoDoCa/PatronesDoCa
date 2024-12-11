package clientesingleton;

public class ClienteSingleton {

    public static void main(String[] args) {
        // se obtiene la instancia única de Singleton
        Singleton objectOne = Singleton.getInstancia();
        Singleton objectTwo = Singleton.getInstancia();
        
        // se verifica si las dos referencias apuntan al mismo objeto
        System.out.println(objectOne == objectTwo ? "Solo hay una clase" : "El singleton ha fallado");

        // se obtiene la instancia única de ThreadSafeSingleton
        ThreadSafeSingleton threadSafeSingletonOne = ThreadSafeSingleton.getUnica_instancia();
        ThreadSafeSingleton threadSafeSingletonTwo = ThreadSafeSingleton.getUnica_instancia();
        
        // se verifica si ambas referencias apuntan al mismo objeto
        System.out.println(threadSafeSingletonOne == threadSafeSingletonTwo ? "Solo hay una clase" : "El singleton ha fallado");
        }
    
}
