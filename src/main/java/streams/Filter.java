package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Aluno 1", 7);
        Aluno a2 = new Aluno("Aluno 2", 1);
        Aluno a3 = new Aluno("Aluno 3", 5);
        Aluno a4 = new Aluno("Aluno 4", 4);
        Aluno a5 = new Aluno("Aluno 5", 2);
        Aluno a6 = new Aluno("Aluno 6", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = aluno -> aluno.nota > 7;
        Function<Aluno, String> mensagemFinal = aluno -> "Parabéns! " + aluno.nome + " você foi aprovado com sucesso!";

        alunos.stream()
                .filter(aprovados)
                .map(mensagemFinal)
                .forEach(System.out::println);
    }
}
