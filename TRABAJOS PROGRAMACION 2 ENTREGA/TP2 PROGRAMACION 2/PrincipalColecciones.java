public class PrincipalColecciones {
    
    public static void main(String[] args) {
        mostrarIntroduccion();
        
        // Ejecutar todas las secciones en orden
        Seccion1.demostrar();
        Seccion2.demostrar();
        Seccion3.demostrar();
        Seccion4.demostrar();
        Seccion5.demostrar();

    }
    
    /**
     * Muestra la introducción del programa
     */
    static void mostrarIntroduccion() {
        System.out.println("\n");

        System.out.println("  Este programa demuestra:                                    ");
        System.out.println("   Sección 1: Matrices (Arrays)                             ");
        System.out.println("   Sección 2: Listas (Lists)                               ");
        System.out.println("   Sección 3: Conjuntos (Sets) y Deque                     ");
        System.out.println("   Sección 4: Mapas (Maps)                                 ");
        System.out.println("   Sección 5: Ordenamiento Avanzado                        ");
    }
    
  
}