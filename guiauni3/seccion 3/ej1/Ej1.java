// 1. Creación de la excepción Checked
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// 2. Clase de negocio
class CuentaBancaria {
    private double saldo = 1000.0;

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("El monto a retirar (" + monto + ") supera el saldo disponible.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }
}

// 3. Ejecución principal
public class Ej1 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        //try/catch
        try {
            cuenta.retirar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operación fallida: " + e.getMessage());
        }
    }
}