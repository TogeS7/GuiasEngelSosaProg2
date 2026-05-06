public class Ej1 {
    public static void main(String[] args) {
        try {
            //probar el fail-fast
            registrarUsuario("Juan", -5);
        } catch (IllegalArgumentException e) {
        
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }

    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o estar en blanco.");
        }
        
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        
        System.out.println("Usuario " + nombre + " registrado con éxito.");
    }
}