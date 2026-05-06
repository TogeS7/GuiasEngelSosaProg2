
// ===== EJERCICIO 3.1: Clase abstracta y herencia =====

/**
 * CLASE ABSTRACTA: No se puede crear objetos directamente.
 * Obliga a las clases hijas a implementar métodos abstractos.
 * 
 * abstract class = Define la estructura común
 * abstract void = Método sin cuerpo que las subclases deben implementar
 */
abstract class Documento {
    protected String titulo;
    protected String contenido;
    
    public Documento(String titulo) {
        this.titulo = titulo;
        this.contenido = "";
    }
    
    /**
     * MÉTODO ABSTRACTO: sin cuerpo
     * Las subclases DEBEN implementarlo
     */
    abstract void procesar();
    
    /**
     * Método concreto (normal): las subclases lo heredan
     */
    public void agregarContenido(String texto) {
        this.contenido = texto;
    }
    
    public String getTitulo() {
        return titulo;
    }
}

// ===== EJERCICIO 3.2: Sobrescritura y Polimorfismo =====

/**
 * CLASE HIJA 1: Hereda de Documento
 * Implementa el método abstracto procesar()
 */
class Factura extends Documento {
    private double monto;
    
    public Factura(String titulo, double monto) {
        super(titulo);  // Llamar al constructor del padre
        this.monto = monto;
    }
    
    /**
     * @Override indica que estamos sobrescribiendo un método del padre
     * Cada subclase implementa procesar() de forma diferente
     */
    @Override
    void procesar() {
        System.out.println("\n--- PROCESANDO FACTURA ---");
        System.out.println("Factura: " + titulo);
        System.out.println("Monto: $" + monto);
        System.out.println("✓ Factura procesada correctamente");
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
}

/**
 * CLASE HIJA 2: También hereda de Documento
 * Implementa procesar() de DIFERENTE manera
 */
class Recibo extends Documento {
    private String numeroRecibo;
    
    public Recibo(String titulo, String numeroRecibo) {
        super(titulo);
        this.numeroRecibo = numeroRecibo;
    }
    
    @Override
    void procesar() {
        System.out.println("\n--- PROCESANDO RECIBO ---");
        System.out.println("Recibo: " + titulo);
        System.out.println("Número: " + numeroRecibo);
        System.out.println("✓ Recibo procesado correctamente");
    }
}

// ===== EJERCICIO 3.3: Sobrecarga en clases hijas =====

/**
 * SOBRECARGA en la clase hija
 * Mismo nombre de método pero DIFERENTES parámetros
 * Diferente de @Override que tiene los MISMOS parámetros
 */
class FacturaAvanzada extends Documento {
    private double monto;
    
    public FacturaAvanzada(String titulo, double monto) {
        super(titulo);
        this.monto = monto;
    }
    
    /**
     * Método padre (heredado, sobrescrito)
     */
    @Override
    void procesar() {
        System.out.println("\n--- PROCESANDO FACTURA AVANZADA ---");
        System.out.println("Factura: " + titulo);
        System.out.println("Monto: $" + monto);
    }
    
    /**
     * SOBRECARGA: Mismo nombre pero con DIFERENTE parámetro
     * procesar() vs procesar(boolean)
     */
    public void procesar(boolean esUrgente) {
        procesar();  // Llamar al método padre
        if (esUrgente) {
            System.out.println("⚠️ MARCADA COMO URGENTE - Procesar primero");
        }
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 3 =====

public class Seccion3 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║  SECCIÓN 3: HERENCIA, POLIMORFISMO Y ABSTRACTAS      ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 3.1
        System.out.println("\n▶ EJERCICIO 3.1: Clases abstractas y herencia");
        System.out.println("───────────────────────────────────────────────────");
        System.out.println("Nota: No podemos crear: Documento doc = new Documento();");
        System.out.println("Las clases abstractas NO se pueden instanciar directamente");
        System.out.println("Pero sus hijas SÍ pueden.");
        
        // Ejercicio 3.2
        System.out.println("\n▶ EJERCICIO 3.2: Sobrescritura y Polimorfismo");
        System.out.println("───────────────────────────────────────────────────");
        System.out.println("POLIMORFISMO: Un nombre, múltiples comportamientos");
        
        // Crear referencias del tipo padre (Documento)
        // Pero asignar objetos de tipo hijo (Factura, Recibo)
        System.out.println("\nCreando referencias del tipo Documento:");
        Documento doc1 = new Factura("Factura001", 500);
        Documento doc2 = new Recibo("Recibo001", "REC123");
        
        System.out.println("Llamando procesar() en doc1:");
        doc1.procesar();  // Ejecuta procesar() de Factura
        
        System.out.println("\nLlamando procesar() en doc2:");
        doc2.procesar();  // Ejecuta procesar() de Recibo
        
        System.out.println("\n--- EXPLICACIÓN DEL POLIMORFISMO ---");
        System.out.println("Java determina EN TIEMPO DE EJECUCIÓN qué versión");
        System.out.println("del método debe ejecutar según el tipo real del objeto:");
        System.out.println("- doc1 es realmente Factura → ejecuta Factura.procesar()");
        System.out.println("- doc2 es realmente Recibo → ejecuta Recibo.procesar()");
        
        // Ejercicio 3.3
        System.out.println("\n▶ EJERCICIO 3.3: Sobrecarga en clase hija");
        System.out.println("───────────────────────────────────────────────────");
        FacturaAvanzada facturaAvanzada = new FacturaAvanzada("FAV001", 1500);
        
        System.out.println("\nLlamando procesar() (sin parámetros):");
        facturaAvanzada.procesar();
        
        System.out.println("\nLlamando procesar(false) (no es urgente):");
        facturaAvanzada.procesar(false);
        
        System.out.println("\nLlamando procesar(true) (ES URGENTE):");
        facturaAvanzada.procesar(true);
        
        System.out.println("\n--- DIFERENCIA ENTRE @Override Y SOBRECARGA ---");
        System.out.println("@Override: Mismo nombre, MISMOS parámetros");
        System.out.println("  procesar() en padre vs procesar() en hijo");
        System.out.println("\nSobrecarga: Mismo nombre, DIFERENTES parámetros");
        System.out.println("  procesar() vs procesar(boolean esUrgente)");
    }
}
