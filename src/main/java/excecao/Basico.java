package excecao;

import streams.Aluno;

import java.util.Optional;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        imprimirNomeDoAluno(a1);
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        try{
            System.out.println(aluno.nome);
        }catch (Exception e) {
            System.out.println("Problemas ao imprimir o aluno");
            System.out.println(e.getMessage());
        }

    }

}
