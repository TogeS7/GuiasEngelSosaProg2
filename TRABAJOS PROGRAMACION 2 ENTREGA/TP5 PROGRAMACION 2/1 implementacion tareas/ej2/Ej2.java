class TareaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Como no heredamos de Thread, usamos Thread.currentThread() para saber quién se ejecuta
            System.out.println(Thread.currentThread().getName() + " - Número: " + i);
        }
    }
}

public class Ej1 {
    public static void main(String[] args) {
        // 1. Creamos LA TAREA (es una sola instancia)
        TareaRunnable miTarea = new TareaRunnable();

        // 2. Creamos LOS HILOS y le pasamos la tarea al constructor
        Thread hiloA = new Thread(miTarea, "Hilo A");
        Thread hiloB = new Thread(miTarea, "Hilo B");

        // 3. Iniciamos los hilos
        hiloA.start();
        hiloB.start();
    }
}