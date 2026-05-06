import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        // Estructura try-with-resources: inicializa y cierra automáticamente el recurso
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar leer el archivo: " + e.getMessage());
        }
    }
}