// 1. Creación de la excepción Unchecked
class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// 2. Clase de negocio
class Producto {
    private double precio;

    public Producto(double precio) {
        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio ingresado no es válido. Debe ser mayor a 0.");
        }
        this.precio = precio;
    }
}

// 3. Ejecución principal
public class Ej2 {
    public static void main(String[] args) {
        
        Producto p = new Producto(-50.0);
        
        System.out.println("Este mensaje no se imprimirá por el fallo anterior.");
    }
}