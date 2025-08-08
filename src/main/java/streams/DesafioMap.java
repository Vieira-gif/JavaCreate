package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> paraBinario = num -> Integer.toBinaryString(num);
        UnaryOperator<String> inverteString = str -> new StringBuilder(str).reverse().toString();
        Function<String, Integer> paraInteiro = num -> Integer.parseInt(num, 2);

        nums.stream()
                .map(paraBinario)
                .map(inverteString)
                .map(paraInteiro)
                .forEach(print);
    }
}
