package murmuring;

import java.util.List;
import java.util.SortedMap;

public class ClasseDeAula {
    private List<Aluno> classe;

    public ClasseDeAula(List<Aluno> classe) {
        this.classe = classe;
    }

    public void exibeBoletim () {
        this.classe.forEach(aluno -> {
            System.out.println("Aluno: " + aluno.getNome());
            aluno.getNotas().forEach(System.out::print);
        });
    }

}
