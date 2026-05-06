class TareaHilo extends Thread {
    @Override
    public void run() {
        // Bucle que imprime del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.getName() + " - Número: " + i);
        }
    }
}

public class Ej1 {
    public static void main(String[] args) {
      
        TareaHilo hilo1 = new TareaHilo();
        TareaHilo hilo2 = new TareaHilo();
        TareaHilo hilo3 = new TareaHilo();

        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
       
    }
}