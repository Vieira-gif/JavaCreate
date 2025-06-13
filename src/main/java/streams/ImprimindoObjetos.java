package streams;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gu", "Te", "Ma");

        System.out.println();
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}