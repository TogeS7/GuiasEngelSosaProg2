public class Ej3 {
    public static void main(String[] args) {
        //probarenviando "abc" o "0"
        String entrada = "0"; 
        
        try {
            int numero = Integer.parseInt(entrada);
            int resultado = 100 / numero;
            System.out.println("El resultado es: " + resultado);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de cálculo o conversión");
        }
    }
}