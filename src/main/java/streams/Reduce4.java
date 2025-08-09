package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce4 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Glauber", 2.1);
        Aluno a2 = new Aluno("Greenwitch", 7.4);
        Aluno a3 = new Aluno("Gerundio", 5.3);
        Aluno a4 = new Aluno("Geringonça", 9.0);
        Aluno a5 = new Aluno("Gertrudes", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> isNota = aluno -> aluno.nota;
        BiFunction<Media, Double, Media> calcularMedia = Media::adicionar;
        BinaryOperator<Media> combinarMedia = Media::combinar;

        Media media = alunos.parallelStream()
                .filter(aprovado)
                .map(isNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println(media.getTotal());

    }
}
