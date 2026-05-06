
// ===== EJERCICIO 4.1: Interfaces y múltiples implementaciones =====

/**
 * INTERFAZ 1: Define un contrato para exportar documentos
 * Una interfaz solo define QUÉ métodos deben existir
 * NO define CÓMO implementarlos (eso lo hacen las clases)
 */
interface Exportable {
    void exportar();
}

/**
 * INTERFAZ 2: Define un contrato para auditoría
 * Otra interfaz completamente diferente
 */
interface Auditable {
    void registrarAuditoria();
}

/**
 * CLASE que implementa MÚLTIPLES interfaces
 * Una clase puede:
 * - Heredar de 1 clase (extends)
 * - Implementar múltiples interfaces (implements)
 * 
 * Debe implementar TODOS los métodos de AMBAS interfaces
 */
class FacturaConInterfaces implements Exportable, Auditable {
    private String numero;
    private double monto;
    
    public FacturaConInterfaces(String numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }
    
    /**
     * Implementar el método de la interfaz Exportable
     */
    @Override
    public void exportar() {
        System.out.println("\n--- EXPORTANDO FACTURA ---");
        System.out.println("Factura #" + numero + " exportada a PDF");
        System.out.println("Monto: $" + monto);
        System.out.println("✓ Archivo guardado como: Factura_" + numero + ".pdf");
    }
    
    /**
     * Implementar el método de la interfaz Auditable
     */
    @Override
    public void registrarAuditoria() {
        System.out.println("\n--- REGISTRANDO EN AUDITORÍA ---");
        System.out.println("📋 AUDITORIA: Factura #" + numero + " registrada en log");
        System.out.println("   Monto: $" + monto);
        System.out.println("   Hora: " + java.time.LocalTime.now());
        System.out.println("   Usuario: sistema_admin");
    }
}

// ===== EJERCICIO 4.2: Polimorfismo a través de interfaces =====

/**
 * POLIMORFISMO CON INTERFACES
 * Este método acepta CUALQUIER objeto que implemente Exportable
 * No necesita saber cuál es la clase real
 */
class SistemaExportacion {
    
    /**
     * El parámetro es de tipo Exportable (interfaz)
     * Puede recibir cualquier clase que implemente Exportable:
     * - FacturaConInterfaces
     * - Reporte
     * - Contrato
     * - etc.
     */
    public void enviarAImpresion(Exportable documentoExportable) {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║      ENVIANDO A IMPRESIÓN                ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        // Llamamos exportar() sin saber QUÉ tipo es exactamente
        documentoExportable.exportar();
        
        System.out.println("✓ Documento enviado a impresora");
    }
}

/**
 * EJEMPLO: Otra clase que implementa Exportable
 * El método enviarAImpresion() también puede usarla
 */
class ReporteExportable implements Exportable {
    private String titulo;
    
    public ReporteExportable(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public void exportar() {
        System.out.println("\n--- EXPORTANDO REPORTE ---");
        System.out.println("Reporte: " + titulo + " exportado a Excel");
        System.out.println("✓ Archivo guardado como: " + titulo + ".xlsx");
    }
}

/**
 * EJEMPLO: Contrato también implementa Exportable
 */
class ContratoExportable implements Exportable {
    private String numero;
    
    public ContratoExportable(String numero) {
        this.numero = numero;
    }
    
    @Override
    public void exportar() {
        System.out.println("\n--- EXPORTANDO CONTRATO ---");
        System.out.println("Contrato #" + numero + " exportado a Word");
        System.out.println("✓ Archivo guardado como: Contrato_" + numero + ".docx");
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 4 =====

public class Seccion4 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║     SECCIÓN 4: INTERFACES Y POLIMORFISMO              ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 4.1
        System.out.println("\n▶ EJERCICIO 4.1: Implementación de múltiples interfaces");
        System.out.println("───────────────────────────────────────────────────");
        
        FacturaConInterfaces factura = new FacturaConInterfaces("FAC2024001", 2500);
        
        System.out.println("La clase FacturaConInterfaces implementa 2 interfaces:");
        System.out.println("✓ Exportable (método: exportar())");
        System.out.println("✓ Auditable (método: registrarAuditoria())");
        
        // Usar los métodos de ambas interfaces
        factura.exportar();
        factura.registrarAuditoria();
        
        // Ejercicio 4.2
        System.out.println("\n▶ EJERCICIO 4.2: Polimorfismo a través de interfaces");
        System.out.println("───────────────────────────────────────────────────");
        
        SistemaExportacion sistema = new SistemaExportacion();
        
        System.out.println("\n=== EJEMPLO 1: Enviar Factura a imprimir ===");
        sistema.enviarAImpresion(factura);
        
        System.out.println("\n=== EJEMPLO 2: Enviar Reporte a imprimir ===");
        ReporteExportable reporte = new ReporteExportable("Ventas2024");
        sistema.enviarAImpresion(reporte);
        
        System.out.println("\n=== EJEMPLO 3: Enviar Contrato a imprimir ===");
        ContratoExportable contrato = new ContratoExportable("CTR2024001");
        sistema.enviarAImpresion(contrato);
        
        System.out.println("\n--- VENTAJAS DEL POLIMORFISMO CON INTERFACES ---");
        System.out.println("✓ El método enviarAImpresion() es GENÉRICO");
        System.out.println("✓ NO necesita saber cuál es la clase real");
        System.out.println("✓ Funciona con Factura, Reporte, Contrato o cualquier");
        System.out.println("  clase que implemente Exportable");
        System.out.println("✓ Fácil agregar nuevas clases sin cambiar el código");
        
        System.out.println("\n--- DIFERENCIA: HERENCIA vs INTERFACES ---");
        System.out.println("HERENCIA (extends):");
        System.out.println("  - Una clase hereda de UNA clase padre");
        System.out.println("  - Relación IS-A (Factura ES-UN Documento)");
        System.out.println("\nINTERFACES (implements):");
        System.out.println("  - Una clase implementa MÚLTIPLES interfaces");
        System.out.println("  - Relación CAN-DO (Factura PUEDE-HACER Exportable)");
        System.out.println("  - Más flexible para programar");
    }
}
