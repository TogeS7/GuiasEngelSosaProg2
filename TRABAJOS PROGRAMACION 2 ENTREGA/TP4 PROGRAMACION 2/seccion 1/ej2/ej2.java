public class Ej2 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se capturó una excepción: " + e.getMessage());
        } finally {
            System.out.println("Limpieza final");
        }
    }
}