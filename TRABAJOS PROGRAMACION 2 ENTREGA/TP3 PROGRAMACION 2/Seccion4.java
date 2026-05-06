import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Seccion4 {

    public static void ejecutar() {

        System.out.println("=== SECCION 4 ===");

        // 4.1
        boolean any = Stream.of(2,5,7,3,6).anyMatch(n -> n > 5);
        boolean all = Stream.of(2,5,7,3,6).allMatch(n -> n > 1);
        boolean none = Stream.of(2,5,7,3,6).noneMatch(n -> n < 0);

        System.out.println(any);
        System.out.println(all);
        System.out.println(none);

        // 4.2 Optional
        Optional<Integer> num = Stream.of(1,3,5,8)
                .filter(n -> n % 2 == 0)
                .findFirst();

        if(num.isPresent()){
            System.out.println(num.get());
        }

        // 4.3 reduce
        Optional<Integer> suma = Stream.of(1,2,3,4)
                .reduce((a,b) -> a + b);

        System.out.println(suma.get());

        // 4.4 lista sin duplicados
        List<Integer> lista = Stream.of(1,2,2,3,3,4)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(lista);

        // mapa de personas
        List<Persona> personas = Arrays.asList(
                new Persona(1,"Juan"),
                new Persona(2,"Ana")
        );

        Map<Integer,String> mapa = personas.stream()
                .collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre()));

        System.out.println(mapa);
    }
}