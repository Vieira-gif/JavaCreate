package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;

        System.out.println(media.apply(8.6, 9.2));

        BiFunction<Double, Double, String> resultado = (x, y) -> {
            double resultadoFinal = media.apply(x, y);
            return resultadoFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 4.1));
    }
}
