package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (a, b) -> a + b;
        System.out.println(calc.apply(1.0, 2.0));

        calc = (a, b) -> a * b;
        System.out.println(calc.apply(1.0, 2.0));

        BinaryOperator<Integer> calc2 = (a, b) -> a + b;
        System.out.println(calc2.apply(1, 2));

        calc2 = (a, b) -> a * b;
        System.out.println(calc2.apply(1, 2));
    }
}
