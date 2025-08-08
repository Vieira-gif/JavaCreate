package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Caneta", 2.32, 30);
        Produto prod2 = new Produto("Mesa", 600.33, 12);
        Produto prod3 = new Produto("Quadro", 562.3, 8);
        Produto prod4 = new Produto("Livro", 22.66, 0.0);
        Produto prod5 = new Produto("Borracha", 16.21, 0.0);

        List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4, prod5);

        Function<Produto, Double> valorComDesconto = produto -> produto.getPreco() - (produto.getPreco() * 0.3);
        Predicate<Produto> temFrete = produto -> produto.getFrete() <= 0;
        Function<Produto, String> mensagem = produto -> "O produto: " + produto.getDescricao() + " possui frete zerado!";

        produtos.stream().map(valorComDesconto).forEach(System.out::println);
        produtos.stream().filter(temFrete).map(mensagem).forEach(System.out::println);


    }
}
