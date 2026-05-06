
import java.util.Arrays;

// ===== EJERCICIO 1.1: Creación, actualización y recuperación =====

/**
 * Demuestra cómo crear un arreglo, acceder a sus elementos
 * y usar el atributo length.
 */
class EjercicioArrays {
    
    public static void demostrarCreacionYAcceso() {
        System.out.println("\n▶ EJERCICIO 1.1: Creación, actualización y recuperación");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un arreglo de 5 elementos de tipo int
        // new int[5] asigna espacio para 5 enteros
        int[] numeros = new int[5];
        System.out.println("Arreglo creado con tamaño: " + numeros.length);
        
        // Asignar valores a cada posición usando el índice
        // Los índices van de 0 a (length-1)
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        System.out.println("\nArreglo inicial:");
        UtilsArray.imprimirArreglo(numeros);
        
        // Actualizar el tercer elemento (índice 2)
        System.out.println("\nActualizando elemento en índice 2 (era 30, ahora será 99):");
        numeros[2] = 99;
        System.out.println("Nuevo valor: " + numeros[2]);
        
        // Recuperar el último elemento usando length
        // El último elemento siempre está en índice (length-1)
        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("\nÚltimo elemento (índice " + (numeros.length - 1) + "): " + ultimoElemento);
        
        System.out.println("\nArreglo después de cambios:");
        UtilsArray.imprimirArreglo(numeros);
    }
}

// ===== EJERCICIO 1.2: Ordenamiento y Búsqueda =====

/**
 * Demuestra cómo ordenar un arreglo y buscar elementos
 * usando métodos de la clase Arrays.
 */
class EjercicioOrdenamientoYBusqueda {
    
    public static void demostrarOrdenamientoYBusqueda() {
        System.out.println("\n▶ EJERCICIO 1.2: Ordenamiento y Búsqueda");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un arreglo de nombres desordenados
        String[] nombres = {"Carlos", "Ana", "Zoe", "Bruno", "Diana"};
        
        System.out.println("Arreglo original (desordenado):");
       UtilsArray.imprimirArregloString(nombres);
        
        // Ordenar el arreglo usando Arrays.sort()
        // IMPORTANTE: Arrays.sort() modifica el arreglo original (in-place)
        Arrays.sort(nombres);
        System.out.println("\nArreglo después de Arrays.sort():");
        UtilsArray.imprimirArregloString(nombres); 
        // Buscar un nombre específico usando Arrays.binarySearch()
        // IMPORTANTE: binarySearch() solo funciona en arreglos ORDENADOS
        String nombreABuscar = "Diana";
        int posicion = Arrays.binarySearch(nombres, nombreABuscar);
        
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion >= 0) {
            System.out.println("✓ Encontrado en índice: " + posicion);
            System.out.println("  Valor: " + nombres[posicion]);
        } else {
            System.out.println("✗ No encontrado. Índice retornado: " + posicion);
        }
        
        // Buscar otro nombre
        nombreABuscar = "Ana";
        posicion = Arrays.binarySearch(nombres, nombreABuscar);
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion >= 0) {
            System.out.println("✓ Encontrado en índice: " + posicion);
        }
        
        // Intentar buscar un nombre que no existe
        nombreABuscar = "Xavier";
        posicion = Arrays.binarySearch(nombres, nombreABuscar);
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion < 0) {
            System.out.println("✗ No encontrado");
            System.out.println("  (Si estuviera, estaría en índice: " + (-posicion - 1) + ")");
        }
    }
}

// ===== MÉTODOS AUXILIARES =====

/**
 * Función auxiliar para imprimir un arreglo de enteros
 */
class UtilsArray {
    
    static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    static void imprimirArregloString(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 1 =====

public class Seccion1 {
    
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void imprimirArregloString(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║           SECCIÓN 1: MATRICES (ARRAYS)                ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 1.1
        System.out.println("\n▶ EJERCICIO 1.1: Creación, actualización y recuperación");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un arreglo de 5 elementos de tipo int
        int[] numeros = new int[5];
        System.out.println("Arreglo creado con tamaño: " + numeros.length);
        System.out.println("Nota: Los valores iniciales de int[] son 0");
        
        // Asignar valores a cada posición
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        System.out.println("\nArreglo después de asignar valores:");
        imprimirArreglo(numeros);
        
        // Actualizar el tercer elemento (índice 2)
        System.out.println("\nActualizando elemento en índice 2 (era 30, ahora será 99):");
        numeros[2] = 99;
        System.out.println("Nuevo valor: " + numeros[2]);
        
        // Recuperar el último elemento usando length
        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("\nÚltimo elemento (índice " + (numeros.length - 1) + "): " + ultimoElemento);
        
        System.out.println("\nArreglo después de cambios:");
        imprimirArreglo(numeros);
        
        // Ejercicio 1.2
        System.out.println("\n▶ EJERCICIO 1.2: Ordenamiento y Búsqueda");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un arreglo de nombres desordenados
        String[] nombres = {"Carlos", "Ana", "Zoe", "Bruno", "Diana"};
        
        System.out.println("Arreglo original (desordenado):");
        imprimirArregloString(nombres);
        
        // Ordenar con Arrays.sort()
        System.out.println("\nUsando Arrays.sort()...");
        Arrays.sort(nombres);
        System.out.println("Arreglo ordenado:");
        imprimirArregloString(nombres);
        
        // Buscar elementos
        System.out.println("\n--- Búsquedas con Arrays.binarySearch() ---");
        
        String nombreABuscar = "Diana";
        int posicion = Arrays.binarySearch(nombres, nombreABuscar);
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion >= 0) {
            System.out.println("✓ Encontrado en índice: " + posicion);
        }
        
        nombreABuscar = "Ana";
        posicion = Arrays.binarySearch(nombres, nombreABuscar);
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion >= 0) {
            System.out.println("✓ Encontrado en índice: " + posicion);
        }
        
        nombreABuscar = "Xavier";
        posicion = Arrays.binarySearch(nombres, nombreABuscar);
        System.out.println("\nBúsqueda de \"" + nombreABuscar + "\":");
        if (posicion < 0) {
            System.out.println("✗ No encontrado");
        }
        
        System.out.println("\n--- RESUMEN DE ARRAYS ---");
        System.out.println("✓ Tamaño FIJO (no se puede cambiar)");
        System.out.println("✓ Acceso rápido por índice");
        System.out.println("✓ Arrays.sort() para ordenar");
        System.out.println("✓ Arrays.binarySearch() para buscar (requiere estar ordenado)");
    }
}