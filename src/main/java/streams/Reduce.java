package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce {
    public static void main(String[] args) {
        /*
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> sum = (acumulador, dadoDaLista) -> acumulador + dadoDaLista;

        //SEM O .GET() pega somente a referencia da memoria
        System.out.println(lista.stream().reduce(sum).get());

        //PASSANDO UM VALOR INICIAL, NÃO PRECISA DO .GET()
        System.out.println(lista.stream().reduce(0, sum));

        //OFF TOPIC - .parallelStream(), para cada dado dentro de list o valor inicial é acrescentando na soma, tipo (1 + 10, 2 + 10, 3 + 10...)
        System.out.println(lista.parallelStream().reduce(10, sum));

        lista.stream().filter(num -> num > 5).reduce(sum).ifPresent(System.out::println);
        */

        String texto = "Olá, mundo!";
        Optional<String> optionalTexto = Optional.ofNullable(texto);

        if (optionalTexto.isPresent()) {
            String maiusculo = optionalTexto.get().toUpperCase();
            System.out.println(maiusculo);
        } else {
            System.out.println("Texto ausente");
        }

    }
}
