package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Exercicio {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gebureia", 41, "Feminino", Arrays.asList(3.2, 1.2, 8.2, 9.0));
        Pessoa p2 = new Pessoa("Gardenal", 12, "Masculino", Arrays.asList(1.2, 7.3, 9.1, 0.1));
        Pessoa p3 = new Pessoa("Giroflex", 85, "Masculino", Arrays.asList(7.1, 10.0, 9.1, 10.0));
        Pessoa p4 = new Pessoa("Gandula", 92, "Masculino", Arrays.asList(6.4, 8.9, 4.2, 9.0));
        Pessoa p5 = new Pessoa("Gentilho", 57, "Feminino", Arrays.asList(7.6, 6.5, 7.8, 6.5));
        Pessoa p6 = new Pessoa("Genebra", 46, "Masculino", Arrays.asList(3.6, 3.1, 7.3, 6.2));

        Predicate<Pessoa> masc = pessoa -> pessoa.getSexo().equalsIgnoreCase("Masculino");
        Predicate<Pessoa> feme = pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino");

        //Function<Pessoa, Double> media = Pessoa::getNota;

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4, p5, p6);

        pessoas.stream().filter(masc).map(Pessoa::getNome).forEach(System.out::println);
        pessoas.stream().filter(feme).map(Pessoa::getNome).forEach(System.out::println);








    }
}
