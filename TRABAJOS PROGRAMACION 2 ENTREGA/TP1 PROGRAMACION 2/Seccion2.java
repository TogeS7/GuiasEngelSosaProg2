
// ===== EJERCICIO 2.1: Métodos con y sin retorno =====

/**
 * Demuestra métodos sin retorno (void) y con retorno.
 */
class Reporte {
    private String titulo;
    private String contenido;
    
    public Reporte(String titulo) {
        this.titulo = titulo;
        this.contenido = "";
    }
    
    /**
     * MÉTODO SIN RETORNO (void)
     * Solo realiza una acción, no devuelve nada
     */
    public void generarEncabezado() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║           REPORTE: " + titulo);
        System.out.println("║        Generado el: " + java.time.LocalDate.now());
        System.out.println("╚════════════════════════════════════════╝");
    }
    
    /**
     * MÉTODO CON RETORNO (String)
     * Devuelve un valor de tipo String
     */
    public String obtenerCuerpo() {
        return "Este es el cuerpo del reporte con información detallada.";
    }
    
    /**
     * MÉTODO CON RETORNO (int)
     * Devuelve un valor de tipo int
     */
    public int obtenerNumeroPaginas() {
        return 5;
    }
    
    public void mostrarReporte() {
        generarEncabezado();
        System.out.println(obtenerCuerpo());
        System.out.println("Páginas: " + obtenerNumeroPaginas());
    }
}

// ===== EJERCICIO 2.2: Sobrecarga de constructores y métodos =====

/**
 * SOBRECARGA: Múltiples métodos/constructores con el MISMO NOMBRE
 * pero DIFERENTE cantidad o tipo de parámetros.
 * Java elige automáticamente cuál usar.
 */
class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;
    
    // CONSTRUCTOR 1: sin parámetros (por defecto)
    public Usuario() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.correo = "Sin correo";
        this.telefono = "Sin teléfono";
    }
    
    // CONSTRUCTOR 2: solo nombre (SOBRECARGA)
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.correo = "Sin correo";
        this.telefono = "Sin teléfono";
    }
    
    // CONSTRUCTOR 3: nombre y edad (SOBRECARGA)
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = "Sin correo";
        this.telefono = "Sin teléfono";
    }
    
    /**
     * MÉTODO 1: Actualizar solo correo
     */
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("✓ Correo actualizado a: " + correo);
    }
    
    /**
     * MÉTODO 2: Actualizar correo Y teléfono (SOBRECARGA)
     * Mismo nombre pero diferente parámetros
     */
    public void actualizarPerfil(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println("✓ Correo y teléfono actualizados");
        System.out.println("  Correo: " + correo);
        System.out.println("  Teléfono: " + telefono);
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DEL USUARIO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
    }
}

// ===== EJERCICIO 2.3: Argumentos variables (var-args) =====

/**
 * Los argumentos variables (...) permiten pasar 0, 1, 2 o más parámetros
 * del MISMO TIPO dentro de un método.
 */
class GeneradorReporte {
    
    /**
     * Método que acepta VARIABLE número de secciones
     * Sintaxis: String... secciones
     */
    public void agregarSecciones(String... secciones) {
        System.out.println("\n=== SECCIONES DEL REPORTE ===");
        
        if (secciones.length == 0) {
            System.out.println("No hay secciones agregadas");
            return;
        }
        
        // Recorrer todas las secciones con for-each
        int numero = 1;
        for (String seccion : secciones) {
            System.out.println(numero + ". " + seccion);
            numero++;
        }
    }
    
    /**
     * Método que suma números variables
     * También usa var-args con tipo int
     */
    public int sumarNumeros(int... numeros) {
        int total = 0;
        for (int num : numeros) {
            total = total + num;
        }
        return total;
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 2 =====

public class Seccion2 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║     SECCIÓN 2: MÉTODOS Y CONSTRUCTORES                ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 2.1
        System.out.println("\n▶ EJERCICIO 2.1: Métodos con y sin retorno");
        System.out.println("───────────────────────────────────────────────────");
        Reporte reporte = new Reporte("Ventas Mensuales");
        reporte.mostrarReporte();
        
        // Ejercicio 2.2
        System.out.println("\n▶ EJERCICIO 2.2: Sobrecarga de constructores y métodos");
        System.out.println("───────────────────────────────────────────────────");
        
        System.out.println("\nConstructor 1 (sin parámetros):");
        Usuario usuario1 = new Usuario();
        usuario1.mostrarInfo();
        
        System.out.println("\nConstructor 2 (solo nombre):");
        Usuario usuario2 = new Usuario("Juan");
        usuario2.mostrarInfo();
        
        System.out.println("\nConstructor 3 (nombre y edad):");
        Usuario usuario3 = new Usuario("María", 28);
        usuario3.mostrarInfo();
        
        System.out.println("\nMétodo 1 (solo correo):");
        usuario3.actualizarPerfil("maria@email.com");
        
        System.out.println("\nMétodo 2 (correo y teléfono):");
        usuario3.actualizarPerfil("maria@email.com", "1234567890");
        usuario3.mostrarInfo();
        
        // Ejercicio 2.3
        System.out.println("\n▶ EJERCICIO 2.3: Argumentos variables");
        System.out.println("───────────────────────────────────────────────────");
        GeneradorReporte generador = new GeneradorReporte();
        
        System.out.println("\nLlamada con 3 argumentos:");
        generador.agregarSecciones("Introducción", "Desarrollo", "Conclusión");
        
        System.out.println("\nLlamada con 1 argumento:");
        generador.agregarSecciones("Solo una sección");
        
        System.out.println("\nLlamada sin argumentos:");
        generador.agregarSecciones();
        
        System.out.println("\n=== SUMANDO NÚMEROS CON VAR-ARGS ===");
        System.out.println("Suma(10, 20, 30) = " + generador.sumarNumeros(10, 20, 30));
        System.out.println("Suma(5, 5, 5, 5, 5) = " + generador.sumarNumeros(5, 5, 5, 5, 5));
    }
}
