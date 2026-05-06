class TareaLarga extends Thread {
    @Override
    public void run() {
        System.out.println("Hilo Secundario: Iniciando una tarea muy pesada...");
        try {
            
            Thread.sleep(5000); 
            System.out.println("Hilo Secundario: Tarea terminada con éxito.");
        } catch (InterruptedException e) {
            
            System.out.println("Hilo Secundario: ¡Me interrumpieron antes de terminar!");
        }
    }
}

public class Ej2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main: Iniciando programa principal.");
        
        TareaLarga hiloSecundario = new TareaLarga();
        hiloSecundario.start();

       
        Thread.sleep(1000); 
        
        System.out.println("Main: Ya me cansé de esperar, voy a interrumpir al hilo.");
        hiloSecundario.interrupt(); 
        
        System.out.println("Main: Fin del programa principal.");
    }
}