/**
 * SECCIÓN 3: Conjuntos (Sets) y Colas Deque
 */

import java.util.HashSet;
import java.util.ArrayDeque;

// ===== EJERCICIO 3.1 =====
class EjercicioHashSet {
    
    public static void demostrarHashSet() {
        System.out.println("\n▶ EJERCICIO 3.1: Unicidad en Sets");
        System.out.println("───────────────────────────────────────────────────");
        
        HashSet<Integer> numeros = new HashSet<Integer>();
        System.out.println("HashSet creado (vacío)");
        System.out.println("Tamaño: " + numeros.size());
        
        System.out.println("\nAgregando número 5 tres veces:");
        System.out.println("numeros.add(5): " + numeros.add(5));
        System.out.println("numeros.add(5): " + numeros.add(5));
        System.out.println("numeros.add(5): " + numeros.add(5));
        
        System.out.println("\nResultado: Solo se almacenó UNA VEZ");
        System.out.println("Tamaño: " + numeros.size());
        
        System.out.println("\nAgregando otros números:");
        numeros.add(3);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);
        System.out.println("Números agregados: 3, 7, 1, 9");
        System.out.println("Tamaño: " + numeros.size());
        System.out.println("Contenido (sin orden garantizado): " + numeros);
        
        System.out.println("\nVerificando existencia:");
        System.out.println("¿Contiene 5? " + numeros.contains(5));
        System.out.println("¿Contiene 7? " + numeros.contains(7));
        System.out.println("¿Contiene 100? " + numeros.contains(100));
        
        System.out.println("\nEliminando 7:");
        numeros.remove(7);
        System.out.println("Contenido: " + numeros);
    }
}

// ===== EJERCICIO 3.2 =====
class EjercicioArrayDeque {
    
    public static void demostrarArrayDeque() {
        System.out.println("\n▶ EJERCICIO 3.2: Colas de doble extremo con ArrayDeque");
        System.out.println("───────────────────────────────────────────────────");
        
        ArrayDeque<String> cola = new ArrayDeque<String>();
        System.out.println("ArrayDeque creado (vacío)");
        
        System.out.println("\nAgregando al INICIO:");
        cola.addFirst("Tercero");
        System.out.println("Contenido: " + cola);
        
        cola.addFirst("Primero");
        System.out.println("Contenido: " + cola);
        
        System.out.println("\nAgregando al FINAL:");
        cola.addLast("Cuarto");
        System.out.println("Contenido: " + cola);
        
        cola.addLast("Quinto");
        System.out.println("Contenido: " + cola);
        
        // 🔧 CORRECCIÓN
        String temp = cola.removeFirst();
        cola.addFirst("Segundo");
        cola.addFirst(temp);
        System.out.println("\nAgregado \"Segundo\" en índice 1");
        System.out.println("Contenido: " + cola);
        
        System.out.println("\nRecuperando:");
        System.out.println("Primero: " + cola.getFirst());
        System.out.println("Último: " + cola.getLast());
        
        System.out.println("\nEliminando:");
        System.out.println("removeFirst(): " + cola.removeFirst());
        System.out.println("Contenido: " + cola);
        
        System.out.println("removeLast(): " + cola.removeLast());
        System.out.println("Contenido: " + cola);
    }
}

// ===== CLASE PRINCIPAL =====
public class Seccion3 {
    
    public static void demostrar() {
        
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║        SECCIÓN 3: SETS Y DEQUE                       ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // HashSet
        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(5);
        numeros.add(5);
        numeros.add(3);
        numeros.add(7);
        
        System.out.println("Contenido HashSet: " + numeros);
        
        // ArrayDeque
        ArrayDeque<String> cola = new ArrayDeque<String>();
        cola.addFirst("Tercero");
        cola.addFirst("Primero");
        cola.addLast("Cuarto");
        cola.addLast("Quinto");
        
        // 🔧 CORRECCIÓN
        String temp = cola.removeFirst();
        cola.addFirst("Segundo");
        cola.addFirst(temp);
        
        System.out.println("Contenido Cola: " + cola);
    }
}