package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = prod -> System.out.println(prod.nome);

        Produto p1 = new Produto("Caneta 1", 12.3, 0.09);
        Produto p2 = new Produto("Caneta 2", 12.3, 0.09);
        Produto p3 = new Produto("Caneta 3", 12.3, 0.09);
        Produto p4 = new Produto("Caneta 4", 12.3, 0.09);
        Produto p5 = new Produto("Caneta 5", 12.3, 0.09);

        //Executar o Consumer
        imprimir.accept(p1);

        List<Produto> produtoList = Arrays.asList(p1, p2, p3, p4, p5);

        produtoList.forEach(imprimir);
        produtoList.forEach(p -> System.out.println(p.nome));
        produtoList.forEach(System.out::println);
    }
}
