
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;

// ===== EJERCICIO 4.1: Manejo de HashMap =====

/**
 * HashMap almacena pares clave-valor
 * No garantiza orden
 */
class EjercicioHashMap {
    
    public static void demostrarHashMap() {
        System.out.println("\n▶ EJERCICIO 4.1: Manejo de HashMap");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un HashMap con clave Integer y valor String
        HashMap<Integer, String> usuarios = new HashMap<Integer, String>();
        System.out.println("HashMap creado (vacío)");
        System.out.println("Tamaño: " + usuarios.size());
        
        // CREATE: Agregar entradas con put()
        System.out.println("\nAgregando usuarios con put(clave, valor):");
        usuarios.put(1, "Juan");
        usuarios.put(2, "María");
        usuarios.put(3, "Carlos");
        usuarios.put(4, "Ana");
        System.out.println("Usuarios agregados");
        System.out.println("Contenido: " + usuarios);
        System.out.println("Tamaño: " + usuarios.size());
        
        // READ: Recuperar valor por clave con get()
        System.out.println("\nLeyendo valor por clave con get():");
        String nombre = usuarios.get(2);
        System.out.println("Usuario con ID 2: " + nombre);
        
        // UPDATE: Actualizar valor con replace()
        System.out.println("\nActualizando usuario ID 2 con replace():");
        System.out.println("Valor anterior: " + usuarios.get(2));
        usuarios.replace(2, "María Elena");
        System.out.println("Valor nuevo: " + usuarios.get(2));
        System.out.println("Contenido: " + usuarios);
        
        // DELETE: Eliminar entrada con remove()
        System.out.println("\nEliminando usuario ID 4 con remove():");
        String eliminado = usuarios.remove(4);
        System.out.println("Usuario eliminado: " + eliminado);
        System.out.println("Tamaño después: " + usuarios.size());
        System.out.println("Contenido: " + usuarios);
    }
}

// ===== EJERCICIO 4.2: Ordenamiento con TreeMap =====

/**
 * TreeMap almacena pares clave-valor ORDENADOS
 * Las claves se ordenan automáticamente por su orden natural
 */
class EjercicioTreeMap {
    
    public static void demostrarTreeMap() {
        System.out.println("\n▶ EJERCICIO 4.2: Ordenamiento con TreeMap");
        System.out.println("───────────────────────────────────────────────────");
        
        // Crear un TreeMap
        TreeMap<Integer, String> usuarios = new TreeMap<Integer, String>();
        System.out.println("TreeMap creado (vacío)");
        
        // Agregar entradas (en orden desordenado)
        System.out.println("\nAgregando usuarios en orden DESORDENADO:");
        usuarios.put(5, "Eva");
        usuarios.put(1, "Juan");
        usuarios.put(3, "Carlos");
        usuarios.put(2, "María");
        usuarios.put(4, "Ana");
        System.out.println("Usuarios agregados: 5, 1, 3, 2, 4");
        
        // TreeMap ordena automáticamente
        System.out.println("\nContenido de TreeMap (ORDENADO automáticamente):");
        System.out.println(usuarios);
        System.out.println("Nota: Las claves están ordenadas ascendentemente (1,2,3,4,5)");
        
        // Obtener todas las claves con keySet()
        System.out.println("\nObteniendo claves con keySet():");
        Set<Integer> claves = usuarios.keySet();
        System.out.println("Claves: " + claves);
        
        // Recorrer las claves
        System.out.println("\nRecorriendo claves en orden:");
        for (Integer id : claves) {
            System.out.println("  ID " + id + " -> " + usuarios.get(id));
        }
        
        // Comparación con HashMap
        System.out.println("\n--- COMPARACIÓN HASHMAP vs TREEMAP ---");
        
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(5, "Eva");
        hashMap.put(1, "Juan");
        hashMap.put(3, "Carlos");
        hashMap.put(2, "María");
        hashMap.put(4, "Ana");
        
        System.out.println("HashMap (sin orden garantizado): " + hashMap);
        System.out.println("TreeMap (ORDENADO automáticamente): " + usuarios);
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 4 =====

public class Seccion4 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║                SECCIÓN 4: MAPAS (MAPS)                ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 4.1
        System.out.println("\n▶ EJERCICIO 4.1: Manejo de HashMap");
        System.out.println("───────────────────────────────────────────────────");
        
        HashMap<Integer, String> usuarios = new HashMap<Integer, String>();
        System.out.println("HashMap creado (clave: Integer, valor: String)");
        
        // CREATE
        System.out.println("\nC (CREATE) - Agregando usuarios con put():");
        usuarios.put(1, "Juan");
        usuarios.put(2, "María");
        usuarios.put(3, "Carlos");
        usuarios.put(4, "Ana");
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Tamaño: " + usuarios.size());
        
        // READ
        System.out.println("\nR (READ) - Recuperando con get():");
        String nombre = usuarios.get(2);
        System.out.println("Usuario ID 2: " + nombre);
        
        // UPDATE
        System.out.println("\nU (UPDATE) - Actualizando con replace():");
        System.out.println("Antes: " + usuarios.get(2));
        usuarios.replace(2, "María Elena");
        System.out.println("Después: " + usuarios.get(2));
        System.out.println("Usuarios: " + usuarios);
        
        // DELETE
        System.out.println("\nD (DELETE) - Eliminando con remove():");
        String eliminado = usuarios.remove(4);
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Tamaño: " + usuarios.size());
        
        // Ejercicio 4.2
        System.out.println("\n▶ EJERCICIO 4.2: Ordenamiento con TreeMap");
        System.out.println("───────────────────────────────────────────────────");
        
        System.out.println("\nCreando TreeMap y agregando en orden DESORDENADO:");
        TreeMap<Integer, String> usuariosTree = new TreeMap<Integer, String>();
        usuariosTree.put(5, "Eva");
        usuariosTree.put(1, "Juan");
        usuariosTree.put(3, "Carlos");
        usuariosTree.put(2, "María");
        usuariosTree.put(4, "Ana");
        
        System.out.println("Entrada: 5, 1, 3, 2, 4");
        System.out.println("TreeMap (ORDENADO automáticamente): " + usuariosTree);
        
        // Obtener claves
        System.out.println("\nObteniendo claves con keySet():");
        Set<Integer> claves = usuariosTree.keySet();
        System.out.println("Claves: " + claves);
        
        // Recorrer
        System.out.println("\nRecorriendo en orden:");
        for (Integer id : claves) {
            System.out.println("  ID " + id + " -> " + usuariosTree.get(id));
        }
        
        // Comparación
        System.out.println("\n--- COMPARACIÓN ---");
        
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(5, "Eva");
        mapa.put(1, "Juan");
        mapa.put(3, "Carlos");
        mapa.put(2, "María");
        mapa.put(4, "Ana");
        
        System.out.println("HashMap: " + mapa);
        System.out.println("  └─ Orden: NO garantizado");
        
        System.out.println("\nTreeMap: " + usuariosTree);
        System.out.println("  └─ Orden: Automáticamente ORDENADO");
        
        System.out.println("\n--- RESUMEN ---");
        System.out.println("✓ HashMap: pares clave-valor, sin orden garantizado");
        System.out.println("✓ TreeMap: pares clave-valor, ORDENADOS automáticamente");
        System.out.println("✓ CRUD: put(), get(), replace(), remove()");
        System.out.println("✓ keySet(): obtener todas las claves");
    }
}