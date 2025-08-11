package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Glauber", 2.1);
        Aluno a2 = new Aluno("Greenwitch", 7.4);
        Aluno a3 = new Aluno("Gerundio", 5.3);
        Aluno a4 = new Aluno("Geringonça", 9.0);
        Aluno a5 = new Aluno("Gertrudes", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Comparator<Aluno> comparadorDeNota = Comparator.comparingDouble((Aluno aluno) -> aluno.nota);

        System.out.println(alunos.stream().max(comparadorDeNota).get().nome);
        System.out.println(alunos.stream().min(comparadorDeNota).get().nome);
    }
}
