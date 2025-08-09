package streams;

import lambdas.Predicado;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Glauber", 2.1);
        Aluno a2 = new Aluno("Greenwitch", 7.4);
        Aluno a3 = new Aluno("Gerundio", 5.3);
        Aluno a4 = new Aluno("Geringonça", 9.0);
        Aluno a5 = new Aluno("Gertrudes", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> isNota = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio = Double::sum;

        alunos.parallelStream()
                .filter(aprovado)
                .map(isNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
