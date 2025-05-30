package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "par" : "impar";

        Function<String, String> oResutadoE =
                valor -> "é " + valor + "  resultado apresentado.";

        String resultadoFinal = parOuImpar.andThen(oResutadoE).apply(4);
        System.out.println(resultadoFinal);
    }
}
