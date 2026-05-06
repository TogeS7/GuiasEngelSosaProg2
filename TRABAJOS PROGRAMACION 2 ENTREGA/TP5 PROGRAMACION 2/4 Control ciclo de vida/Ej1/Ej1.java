class TareaPrioridad implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Imprimimos la identidad del hilo actual
            System.out.println("Soy " + Thread.currentThread().getName() + " procesando...");
        }
    }
}

public class Ej1 {
    public static void main(String[] args) {
        Thread hiloLento = new Thread(new TareaPrioridad(), "Hilo de BAJA Prioridad");
        Thread hiloRapido = new Thread(new TareaPrioridad(), "Hilo de ALTA Prioridad");

        // prioridad de 1 al 10 con 10 maxima
        hiloLento.setPriority(1); // o Thread.MIN_PRIORITY
        hiloRapido.setPriority(10); // o Thread.MAX_PRIORITY

        hiloLento.start();
        hiloRapido.start();
        
       
    }
}