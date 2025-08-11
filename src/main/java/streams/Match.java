package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Glauber", 2.1);
        Aluno a2 = new Aluno("Greenwitch", 7.4);
        Aluno a3 = new Aluno("Gerundio", 5.3);
        Aluno a4 = new Aluno("Geringonça", 9.0);
        Aluno a5 = new Aluno("Gertrudes", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); //TODOS TRUE
        System.out.println(alunos.stream().anyMatch(aprovado)); //ALGUM TRUE
        System.out.println(alunos.stream().noneMatch(aprovado)); //NENHUM TRUE
    }
}
