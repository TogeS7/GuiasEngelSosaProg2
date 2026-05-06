import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ===== CLASE EMPLEADO (para usar en los ejercicios) =====

/**
 * Clase Empleado simple
 */
class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return nombre + " (edad: " + edad + ", salario: $" + String.format("%.2f", salario) + ")";
    }
}

// ===== EJERCICIO 5.1: Orden natural con Comparable =====

/**
 * Empleado que implementa Comparable
 * Define el orden NATURAL por edad
 */
class EmpleadoComparable extends Empleado implements Comparable<EmpleadoComparable> {
    
    public EmpleadoComparable(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }
    
    /**
     * Implementar compareTo() para definir orden natural
     * Ordena por EDAD (ascendente)
     * 
     * Retorna:
     * - Negativo si este objeto < otro
     * - Cero si son iguales
     * - Positivo si este objeto > otro
     */
    @Override
    public int compareTo(EmpleadoComparable otro) {
        // Comparar por edad (ascendente)
        if (this.getEdad() < otro.getEdad()) {
            return -1;  // Este es menor
        } else if (this.getEdad() > otro.getEdad()) {
            return 1;   // Este es mayor
        } else {
            return 0;   // Son iguales
        }
        
        // O más compacto:
        // return Integer.compare(this.getEdad(), otro.getEdad());
    }
}

// ===== EJERCICIO 5.2: Orden personalizado con Comparator =====

/**
 * Comparator para ordenar empleados por nombre
 * implementa la interfaz Comparator
 */
class ComparadorPorNombre implements Comparator<Empleado> {
    
    /**
     * Implementar compare() para definir orden personalizado
     * Ordena por NOMBRE (alfabético)
     */
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        // Comparar alfabéticamente por nombre
        return emp1.getNombre().compareTo(emp2.getNombre());
    }
}

/**
 * Otro comparador para ordenar por salario
 */
class ComparadorPorSalario implements Comparator<Empleado> {
    
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        // Comparar por salario (ascendente)
        return Double.compare(emp1.getSalario(), emp2.getSalario());
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 5 =====

public class Seccion5 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║          SECCIÓN 5: ORDENAMIENTO AVANZADO             ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Crear datos de prueba
        System.out.println("\n--- Creando lista de empleados ---");
        List<EmpleadoComparable> empleados = new ArrayList<EmpleadoComparable>();
        
        empleados.add(new EmpleadoComparable("Carlos", 35, 3000));
        empleados.add(new EmpleadoComparable("Ana", 28, 2500));
        empleados.add(new EmpleadoComparable("Juan", 42, 3500));
        empleados.add(new EmpleadoComparable("María", 31, 2800));
        empleados.add(new EmpleadoComparable("Pedro", 26, 2200));
        
        System.out.println("Empleados creados:");
        for (EmpleadoComparable emp : empleados) {
            System.out.println("  " + emp);
        }
        
        // Ejercicio 5.1
        System.out.println("\n▶ EJERCICIO 5.1: Orden natural con Comparable");
        System.out.println("───────────────────────────────────────────────────");
        System.out.println("Lista ORIGINAL (orden de inserción):");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + empleados.get(i));
        }
        
        // Ordenar usando el orden natural (Comparable)
        System.out.println("\nOrdenando con Collections.sort() usando Comparable:");
        System.out.println("(Orden natural = por EDAD)");
        Collections.sort(empleados);
        
        System.out.println("Lista ORDENADA POR EDAD:");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + empleados.get(i));
        }
        
        // Ejercicio 5.2
        System.out.println("\n▶ EJERCICIO 5.2: Orden personalizado con Comparator");
        System.out.println("───────────────────────────────────────────────────");
        
        // Convertir a List<Empleado> para usar diferentes comparadores
        List<Empleado> empleadosBase = new ArrayList<Empleado>(empleados);
        
        // Ordenar por nombre
        System.out.println("\nOrdenando por NOMBRE (alfabético) con Comparator:");
        Collections.sort(empleadosBase, new ComparadorPorNombre());
        
        System.out.println("Lista ORDENADA POR NOMBRE:");
        for (int i = 0; i < empleadosBase.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + empleadosBase.get(i));
        }
        
        // Ordenar por salario
        System.out.println("\nOrdenando por SALARIO con Comparator:");
        Collections.sort(empleadosBase, new ComparadorPorSalario());
        
        System.out.println("Lista ORDENADA POR SALARIO:");
        for (int i = 0; i < empleadosBase.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + empleadosBase.get(i));
        }
        
        // Comparación
        System.out.println("\n--- RESUMEN ---");
        System.out.println("COMPARABLE:");
        System.out.println("  ✓ Implementar en la clase del objeto");
        System.out.println("  ✓ Método: compareTo()");
        System.out.println("  ✓ Define el orden NATURAL (único)");
        System.out.println("  ✓ Uso: Collections.sort(lista)");
        
        System.out.println("\nCOMPARATOR:");
        System.out.println("  ✓ Clase separada que implementa Comparator");
        System.out.println("  ✓ Método: compare()");
        System.out.println("  ✓ Define orden PERSONALIZADO (múltiples)");
        System.out.println("  ✓ Uso: Collections.sort(lista, comparador)");
        
        System.out.println("\nEN ESTE EJEMPLO:");
        System.out.println("  • EmpleadoComparable: orden natural por EDAD");
        System.out.println("  • ComparadorPorNombre: orden personalizado por NOMBRE");
        System.out.println("  • ComparadorPorSalario: orden personalizado por SALARIO");
    }
}