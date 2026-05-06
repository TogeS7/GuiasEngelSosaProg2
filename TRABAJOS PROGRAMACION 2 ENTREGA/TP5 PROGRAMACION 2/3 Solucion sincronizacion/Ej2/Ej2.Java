class ContadorBloqueSincronizado {
    int cuenta = 0;

    public void incrementar() {
       
        synchronized(this) {
            cuenta++;
        }
    }
}

public class Ej2 {
    public static void main(String[] args) throws InterruptedException {
        ContadorBloqueSincronizado miContador = new ContadorBloqueSincronizado();
        
        Runnable tarea = () -> {
            for (int i = 0; i < 10000; i++) miContador.incrementar();
        };

        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);

        h1.start(); h2.start();
        h1.join(); h2.join();

        System.out.println("Resultado final con Bloque Sincronizado: " + miContador.cuenta);
    }
}