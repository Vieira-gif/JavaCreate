package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Double> lista = Arrays.asList(1.1, 2.2, 3.3);

        BinaryOperator<Double> fun = (y, x) -> x + x;

        System.out.println(lista.stream().reduce(2.1, fun));

    }
}
