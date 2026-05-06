class Contador {
    int cuenta = 0;

    public void incrementar() {
        cuenta++;
    }
}

class TareaIncremento implements Runnable {
    Contador contadorCompartido;

    public TareaIncremento(Contador c) {
        this.contadorCompartido = c;
    }

    @Override
    public void run() {
        // Cada hilo llama al método incrementar 10.000 veces
        for (int i = 0; i < 10000; i++) {
            contadorCompartido.incrementar();
        }
    }
}

public class Ej1 {
    public static void main(String[] args) throws InterruptedException {
        Contador miContador = new Contador();

        Thread hilo1 = new Thread(new TareaIncremento(miContador));
        Thread hilo2 = new Thread(new TareaIncremento(miContador));

        hilo1.start();
        hilo2.start();

       
        hilo1.join();
        hilo2.join();

        //como se pisan da un numero menor D:
        System.out.println("Resultado final esperado: 20000");
        System.out.println("Resultado final REAL: " + miContador.cuenta);
    }
}