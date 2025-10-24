package excecao.personalizadaA;

import streams.Aluno;

public class Validar {
    private Validar() {}

    public static void aluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O Aluno está nulo");
        }

        if (aluno.nome == null || aluno.nome.isEmpty()) {
            throw new StringNegativoException("nome");
        }

        /*if ( aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroNegativoException("nota");
        }*/
    }
}
