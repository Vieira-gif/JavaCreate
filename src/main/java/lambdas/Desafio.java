package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Macbook", 3235.89, 0.50);

        Function<Produto, Double> precoComDesconto = produto -> p.preco - (p.preco * p.desconto);
        UnaryOperator<Double> precoComImposto = preco -> preco >= 2500 ? (preco * 0.085) + preco : preco;
        UnaryOperator<Double> precoComFrete = preco -> preco >= 3000 ? preco + 100 : preco+ 50;
        UnaryOperator<Double> precoArredendodado = preco -> Math.round(preco * 100) / 100.0;
        Function<Double, String> precoFormatado = preco -> "R$" + preco;

        String preco = precoComDesconto
                .andThen(precoComImposto)
                .andThen(precoComFrete)
                .andThen(precoArredendodado)
                .andThen(precoFormatado)
                .apply(p);

        System.out.println("O preço final é: " + preco);

    }
}
