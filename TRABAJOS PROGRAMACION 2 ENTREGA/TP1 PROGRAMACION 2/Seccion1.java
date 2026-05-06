
// ===== EJERCICIO 1.1: Creación de clases y comentarios =====


    /* 
     * BLOQUE DE CONFIGURACIÓN DEL SISTEMA
     * Estas variables contienen valores de configuración
     * que se utilizan en toda la aplicación
     */
    class SistemaGestor {
    // Variable que almacena el nombre del sistema (comentario de una línea)
    private String nombreSistema;
    
    private String version = "1.0";
    private boolean activo = true;
    
    // Constructor
    public SistemaGestor(String nombre) {
        this.nombreSistema = nombre;
    }
    
    // Método que muestra la información
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL SISTEMA ===");
        System.out.println("Nombre: " + nombreSistema);
        System.out.println("Versión: " + version);
        System.out.println("Activo: " + activo);
    }
}

// ===== EJERCICIO 1.2: Uso de modificadores static y final =====

/**
 * Demuestra el uso de static y final para crear constantes.
 * - static: La clase entera comparte una sola copia
 * - final: No se puede modificar después de asignarse
 */
class ConfiguracionSistema {
    // static final = Constante global (una copia para toda la aplicación)
    public static final int MAX_CONEXIONES = 10;
    public static final String NOMBRE_EMPRESA = "TecnoSoluciones";
    
    // Método que muestra la configuración
    public void mostrarConfiguracion() {
        System.out.println("\n=== CONFIGURACIÓN DEL SISTEMA ===");
        System.out.println("Máximo de conexiones: " + MAX_CONEXIONES);
        System.out.println("Nombre empresa: " + NOMBRE_EMPRESA);
        System.out.println("Nota: Estos valores NO pueden cambiar (son final)");
    }
    
    // Método estático (se llama sin crear objeto)
    public static void mostrarMaxConexionesStatic() {
        System.out.println("Max conexiones: " + MAX_CONEXIONES);
    }
}

// ===== EJERCICIO 1.3: Encapsulación y protección de datos =====

/**
 * Ejemplo de encapsulación correcta.
 * Los datos están PROTEGIDOS (private)
 * Y solo se accede a través de MÉTODOS SEGUROS (public)
 */
class CuentaBancaria {
    // DATOS PRIVADOS - No se pueden modificar directamente desde fuera
    private double saldo;
    private String numeroCuenta;
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    /**
     * Método SEGURO para depositar dinero.
     * Valida que el monto sea positivo antes de modificar el saldo.
     */
    public void depositar(double monto) {
        if (monto < 0) {
            System.out.println("❌ Error: No se pueden depositar montos negativos");
            return;
        }
        if (monto == 0) {
            System.out.println("❌ Error: El monto debe ser mayor a 0");
            return;
        }
        saldo = saldo + monto;
        System.out.println("✓ Depósito exitoso de: $" + monto);
    }
    
    /**
     * Método SEGURO para retirar dinero.
     * Valida que haya saldo suficiente.
     */
    public void retirar(double monto) {
        if (monto < 0) {
            System.out.println("❌ Error: No se pueden retirar montos negativos");
            return;
        }
        if (monto > saldo) {
            System.out.println("❌ Error: Saldo insuficiente");
            return;
        }
        saldo = saldo - monto;
        System.out.println("✓ Retiro exitoso de: $" + monto);
    }
    
    // Método para ver el saldo (solo lectura, es seguro)
    public double getSaldo() {
        return saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    // Método que muestra el estado de la cuenta
    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DE CUENTA ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}

// ===== CLASE PARA DEMOSTRAR SECCIÓN 1 =====

public class Seccion1 {
    
    public static void demostrar() {
        System.out.println("\n\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║  SECCIÓN 1: CLASES, ENCAPSULACIÓN Y DOCUMENTACIÓN     ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        
        // Ejercicio 1.1
        System.out.println("\n▶ EJERCICIO 1.1: Creación de clases y comentarios");
        System.out.println("───────────────────────────────────────────────────");
        SistemaGestor sistema = new SistemaGestor("SistemaVentas");
        sistema.mostrarInfo();
        
        // Ejercicio 1.2
        System.out.println("\n▶ EJERCICIO 1.2: Static y Final");
        System.out.println("───────────────────────────────────────────────────");
        ConfiguracionSistema config = new ConfiguracionSistema();
        config.mostrarConfiguracion();
        System.out.println("\nLlamando método estático sin crear objeto:");
        ConfiguracionSistema.mostrarMaxConexionesStatic();
        
        // Ejercicio 1.3
        System.out.println("\n▶ EJERCICIO 1.3: Encapsulación y protección de datos");
        System.out.println("───────────────────────────────────────────────────");
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000);
        cuenta.mostrarEstado();
        
        System.out.println("\nOperaciones en la cuenta:");
        cuenta.depositar(500);
        cuenta.depositar(-100);  // Error: intenta depositar negativo
        cuenta.retirar(200);
        cuenta.retirar(5000);    // Error: saldo insuficiente
        
        cuenta.mostrarEstado();
    }
}
