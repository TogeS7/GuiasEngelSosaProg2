public class Ej1 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Tipo de clase: " + e.getClass().getName());
        }
    }
}