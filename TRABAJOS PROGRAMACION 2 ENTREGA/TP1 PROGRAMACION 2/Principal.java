
public class Principal {
    
    public static void main(String[] args) {
        mostrarIntroduccion();
        
        // Ejecutar todas las secciones en orden
        Seccion1.demostrar();
        Seccion2.demostrar();
        Seccion3.demostrar();
        Seccion4.demostrar();
        

    }
    
    /**
     * Muestra la introducción del programa
     */
    static void mostrarIntroduccion() {
        System.out.println("\n");
        System.out.println("   Este programa demuestra:                               ");
        System.out.println("    Sección 1: Clases, Encapsulación y Documentación     ");
        System.out.println("    Sección 2: Métodos y Constructores                   ");
        System.out.println("    Sección 3: Herencia, Polimorfismo y Abstractas       ");
        System.out.println("    Sección 4: Interfaces y Polimorfismo de Interfaz     ");
    }
}
