import java.util.*;
import java.util.function.*;

public class Seccion1 {

    public static void ejecutar() {

        System.out.println("=== SECCION 1 ===");

        // 1. Predicate
        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println(esPar.test(4));

        // 2. Function
        Function<String, Integer> longitud = s -> s.length();
        System.out.println(longitud.apply("Hola"));

        // 3. Consumer
        Consumer<Integer> imprimir = n -> System.out.println(n);
        imprimir.accept(10);

        // 4. Supplier
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        // 1.2 Comparator
        List<String> lista = Arrays.asList("Juan", "Maria", "Ana");
        lista.sort((a, b) -> a.length() - b.length());
        System.out.println(lista);

        // 1.3 primitivas
        IntPredicate esPar2 = n -> n % 2 == 0;
        System.out.println(esPar2.test(5));

        ToIntFunction<String> long2 = s -> s.length();
        System.out.println(long2.applyAsInt("Hola"));
    }
}