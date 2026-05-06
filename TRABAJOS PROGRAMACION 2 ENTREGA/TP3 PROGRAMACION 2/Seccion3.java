import java.util.*;
import java.util.stream.*;

public class Seccion3 {

    public static void ejecutar() {

        System.out.println("=== SECCION 3 ===");

        // 3.1 map
        Stream.of("Juan","Maria","Ana")
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        // 3.2 mapToInt
        int suma = Stream.of("Juan","Maria","Ana")
                .mapToInt(s -> s.length())
                .sum();

        System.out.println("Suma letras: " + suma);

        // 3.3 flatMap
        List<List<String>> datos = Arrays.asList(
                Arrays.asList("Juan","Pedro"),
                Arrays.asList("Maria","Ana")
        );

        long cant = datos.stream()
                .flatMap(l -> l.stream())
                .filter(s -> s.length() > 4)
                .count();

        System.out.println(cant);

        // 3.4 sorted
        Stream.of("Juan","Maria","Ana")
                .sorted()
                .forEach(System.out::println);

        System.out.println("Por longitud:");

        Stream.of("Juan","Maria","Ana")
                .sorted((a,b) -> a.length() - b.length())
                .forEach(System.out::println);
    }
}