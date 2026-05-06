
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ===== EJERCICIO 2.1: Operaciones CRUD en ArrayList =====

/**
 * CRUD = Create, Read, Update, Delete
 * ArrayList es una lista MUTABLE respaldada por un arreglo dinámico
 */
class EjercicioArrayList {
    
    public static void demostrarArrayList() {
        System.out.println("\n▶ EJERCICIO 2.1: Operaciones CRUD en ArrayList");
        System.out.println("───────────────────────────────────────────────────");
        
        // CREATE: Crear un ArrayList de String
        ArrayList<String> frutas = new ArrayList<String>();
        System.out.println("ArrayList vacío creado");
        System.out.println("Tamaño: " + frutas.size());
        
        // CREATE: Agregar elementos con add()
        System.out.println("\nAgregando elementos con add():");
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        System.out.println("Elementos agregados: Manzana, Banana, Cereza");
        System.out.println("Tamaño actual: " + frutas.size());
        Seccion2.imprimirLista(frutas);
        
        // READ: Recuperar elementos con get()
        System.out.println("\nREAD - Recuperando elemento en índice 0:");
        String primerElemento = frutas.get(0);
        System.out.println("Primer elemento: " + primerElemento);
        
        // UPDATE: Actualizar elemento con set()
        System.out.println("\nUPDATE - Actualizando elemento en índice 1:");
        System.out.println("Antes: " + frutas.get(1));
        frutas.set(1, "Durazno");
        System.out.println("Después: " + frutas.get(1));
        Seccion2.imprimirLista(frutas);
        
        // DELETE: Eliminar elemento con remove()
        System.out.println("\nDELETE - Eliminando último elemento:");
        String eliminado = frutas.remove(frutas.size() - 1);
        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Tamaño después de eliminar: " + frutas.size());
        Seccion2.imprimirLista(frutas);
    }
}

// ===== EJERCICIO 2.2: Listas Inmutables vs LinkedList =====

/**
 * Demuestra la diferencia entre listas inmutables y mutables
 * List.of() crea una lista inmutable
 * LinkedList es una lista mutable doblemente enlazada
 */
class EjercicioListasInmutablesYLinked {
    
    public static void demostrarListasInmutables() {
        System.out.println("\n▶ EJERCICIO 2.2: Listas Inmutables vs LinkedList");
        System.out.println("───────────────────────────────────────────────────");
        
        // PARTE 1: Lista inmutable con List.of()
        System.out.println("\n--- Parte 1: Lista Inmutable ---");
        System.out.println("Creando lista inmutable con List.of():");
        
        List<String> listaInmutable = List.of("Rojo", "Verde", "Azul");
        System.out.println("Lista inmutable: " + listaInmutable);
        System.out.println("Tamaño: " + listaInmutable.size());
        
        // Intentar agregar un elemento a lista inmutable
        System.out.println("\nIntentando agregar elemento a lista inmutable...");
        try {
            listaInmutable.add("Amarillo");
            System.out.println("✓ Elemento agregado (esto no debería pasar)");
        } catch (UnsupportedOperationException e) {
            System.out.println("❌ UnsupportedOperationException capturada");
            System.out.println("   Mensaje: " + e.getMessage());
            System.out.println("   Esto es ESPERADO - la lista es inmutable");
        }
        
        // PARTE 2: Convertir a LinkedList (mutable)
        System.out.println("\n--- Parte 2: Convertir a LinkedList ---");
        System.out.println("Pasando lista inmutable al constructor de LinkedList:");
        
        LinkedList<String> colores = new LinkedList<String>(listaInmutable);
        System.out.println("LinkedList creado desde lista inmutable");
        System.out.println("Contenido: " + colores);
        
        // Ahora SÍ podemos modificar
        System.out.println("\nAhora la lista es MUTABLE:");
        
        // Agregar al inicio
        System.out.println("\nAgregando \"Blanco\" al inicio con addFirst():");
        colores.addFirst("Blanco");
        System.out.println("Contenido: " + colores);
        
        // Agregar al final
        System.out.println("\nAgregando \"Negro\" al final con addLast():");
        colores.addLast("Negro");
        System.out.println("Contenido: " + colores);
        
        // Insertar en el medio (eficiente en LinkedList)
        System.out.println("\nInsertando \"Naranja\" en el medio (índice 2):");
        colores.add(2, "Naranja");
        System.out.println("Contenido: " + colores);
        
        // Recuperar del inicio
        System.out.println("\nRecuperando primer elemento con getFirst():");
        System.out.println("Primer elemento: " + colores.getFirst());
        
        // Recuperar del final
        System.out.println("\nRecuperando último elemento con getLast():");
        System.out.println("Último elemento: " + colores.getLast());
        
        // Eliminar del inicio
        System.out.println("\nEliminando primer elemento con removeFirst():");
        String eliminado = colores.removeFirst();
        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Contenido: " + colores);
        
        // Eliminar del final
        System.out.println("\nEliminando último elemento con removeLast():");
        eliminado = colores.removeLast();
        System.out.println("Elemento eliminado: " + eliminado);
        System.out.println("Contenido: " + colores);
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 2 =====

public class Seccion2 {
    
    static void imprimirLista(List<?> lista) {
        System.out.println("Contenido: " + lista);
    }
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║              SECCIÓN 2: LISTAS (LISTS)                ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 2.1
        System.out.println("\n▶ EJERCICIO 2.1: Operaciones CRUD en ArrayList");
        System.out.println("───────────────────────────────────────────────────");
        
        ArrayList<String> frutas = new ArrayList<String>();
        System.out.println("ArrayList vacío creado");
        System.out.println("Tamaño: " + frutas.size());
        
        // CREATE - Agregar elementos
        System.out.println("\nC (CREATE) - Agregando elementos con add():");
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        System.out.println("Elementos: " + frutas);
        System.out.println("Tamaño: " + frutas.size());
        
        // READ - Leer elementos
        System.out.println("\nR (READ) - Leyendo elemento en índice 0:");
        String primero = frutas.get(0);
        System.out.println("Primer elemento: " + primero);
        
        // UPDATE - Actualizar elemento
        System.out.println("\nU (UPDATE) - Actualizando elemento en índice 1:");
        System.out.println("Antes: " + frutas.get(1));
        frutas.set(1, "Durazno");
        System.out.println("Después: " + frutas.get(1));
        System.out.println("Lista: " + frutas);
        
        // DELETE - Eliminar elemento
        System.out.println("\nD (DELETE) - Eliminando último elemento:");
        String ultimo = frutas.remove(frutas.size() - 1);
        System.out.println("Eliminado: " + ultimo);
        System.out.println("Lista final: " + frutas);
        
        // Ejercicio 2.2
        System.out.println("\n▶ EJERCICIO 2.2: Listas Inmutables vs LinkedList");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear lista inmutable
        System.out.println("\n--- Creando lista INMUTABLE con List.of() ---");
        List<String> listaInmutable = List.of("Rojo", "Verde", "Azul");
        System.out.println("Lista inmutable: " + listaInmutable);
        
        // Intentar modificar
        System.out.println("\nIntentando agregar a lista inmutable...");
        try {
            listaInmutable.add("Amarillo");
        } catch (UnsupportedOperationException e) {
            System.out.println("❌ Excepción capturada: UnsupportedOperationException");
            System.out.println("   Razón: La lista es INMUTABLE");
        }
        
        // Convertir a LinkedList
        System.out.println("\n--- Convirtiendo a LinkedList (MUTABLE) ---");
        LinkedList<String> colores = new LinkedList<String>(listaInmutable);
        System.out.println("LinkedList creado: " + colores);
        
        // Operaciones en LinkedList
        System.out.println("\nOperaciones en LinkedList:");
        System.out.println("addFirst(\"Blanco\"): ");
        colores.addFirst("Blanco");
        System.out.println("  " + colores);
        
        System.out.println("\naddLast(\"Negro\"):");
        colores.addLast("Negro");
        System.out.println("  " + colores);
        
        System.out.println("\nadd(2, \"Naranja\") - insertar en el medio:");
        colores.add(2, "Naranja");
        System.out.println("  " + colores);
        
        System.out.println("\nremoveFirst():");
        String removed = colores.removeFirst();
        System.out.println("  Eliminado: " + removed);
        System.out.println("  " + colores);
        
        System.out.println("\nremoveLast():");
        removed = colores.removeLast();
        System.out.println("  Eliminado: " + removed);
        System.out.println("  " + colores);
        
        System.out.println("\n--- RESUMEN ---");
        System.out.println("✓ ArrayList: lista dinámica, acceso rápido por índice");
        System.out.println("✓ List.of(): crea lista INMUTABLE");
        System.out.println("✓ LinkedList: inserciones eficientes, doblemente enlazada");
        System.out.println("✓ CRUD: Create (add), Read (get), Update (set), Delete (remove)");
    }
}