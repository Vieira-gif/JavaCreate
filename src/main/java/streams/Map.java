package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW ", "Honda ", "Gol ", "Audi");

        // PODERIA SER UNARYOPERADOR, POR QUE RETORNAR O MESMO TYPE (STRING PARA STRING)

        Function<String, String> emMaiusculo = marca -> marca.toUpperCase();
        Function<String, String> primeiraLetra = marca -> marca.charAt(0) + "";
        Function<String, String> grito = marca -> marca + "!!!!!!!";

        marcas.stream().map(emMaiusculo).forEach(print);
        marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);

        marcas.stream().map(primeiraLetra).forEach(print);
        marcas.stream().map(marca -> marca.charAt(0) + "").forEach(print);

        marcas.stream().map(grito).forEach(print);
        marcas.stream().map(marca -> marca + "!!!!!!!").forEach(print);
    }
}
