package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 1000, .10);

        BinaryOperator<Double> precoReal = (preco, desconto) -> preco - (preco * desconto); // 900
        Function<Double, Double> imposto = valorImposto -> valorImposto >= 900 ? (valorImposto * .10) + valorImposto : valorImposto; // 990 
        //UnaryOperator<Integer> frete = valorFrete -> valorFrete >= 3000 ? 100 : 50;
        //Function<Integer, String> frete = valorFrete -> valorFrete >= 3000 ? 100 : 50;

        System.out.println(precoReal.andThen(imposto).apply(p.preco, p.desconto));
    }
}
