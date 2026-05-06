class ContadorSincronizado {
    int cuenta = 0;

    
    public synchronized void incrementar() {
        cuenta++;
    }
}

public class Ej1 {
    public static void main(String[] args) throws InterruptedException {
        ContadorSincronizado miContador = new ContadorSincronizado();
        
        // lambda para crear la tarea
        Runnable tarea = () -> {
            for (int i = 0; i < 10000; i++) miContador.incrementar();
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start(); h2.start();
        h1.join(); h2.join();

        // Ahora el resultado SIEMPRE será 20.000 exacto.
        System.out.println("Resultado final con Synchronized: " + miContador.cuenta);
    }
}