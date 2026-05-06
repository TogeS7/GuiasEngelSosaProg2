import java.util.stream.Stream;

public class Seccion2 {

    public static void ejecutar() {

        System.out.println("=== SECCION 2 ===");

        // 2.1
        long total = Stream.of(2,5,3,3,6,2,4)
                .distinct()
                .skip(1)
                .limit(3)
                .count();

        System.out.println(total);

        // 2.2
        long count = Stream.of(1,2,3,4,5,6)
                .filter(n -> n > 3)
                .peek(n -> System.out.println(n))
                .count();

        System.out.println("Cantidad: " + count);
    }
}