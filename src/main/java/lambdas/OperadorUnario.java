package lambdas;

import java.util.function.UnaryOperator;

// UnaryOperator - recebe um algo retorna algo
// andThen - executa de cima para baixo
// compose - executa de baixo para cima

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = x -> x + 2;
        UnaryOperator<Integer> vezesDois = x -> x * 2;
        UnaryOperator<Integer> aoQuadrado = x -> x * x;

        System.out.println(maisDois
                        .andThen(vezesDois)
                        .andThen(aoQuadrado)
                        .apply(0));

        System.out.println(maisDois
                        .compose(vezesDois)
                        .compose(aoQuadrado)
                        .apply(0));
    }
}
