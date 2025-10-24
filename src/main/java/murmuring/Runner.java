package murmuring;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Mamifero animal = new Mamifero("Gorila", 80, 3800, 143, true, 22, "Primata", "Mamifero");

        Aluno a1 = new Aluno("Fulano", Arrays.asList(Aluno.geraNota(), Aluno.geraNota(), Aluno.geraNota()));
        Aluno a2 = new Aluno("Beltrano", Arrays.asList(Aluno.geraNota(), Aluno.geraNota(), Aluno.geraNota()));
        Aluno a3 = new Aluno("Ciclano", Arrays.asList(Aluno.geraNota(), Aluno.geraNota(), Aluno.geraNota()));
        Aluno a4 = new Aluno("Uzuberquistão", Arrays.asList(Aluno.geraNota(), Aluno.geraNota(), Aluno.geraNota()));

        ClasseDeAula classe = new ClasseDeAula(Arrays.asList(a1, a2, a3, a4));

        classe.exibeBoletim();
    }
}
