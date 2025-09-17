package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "A");
        resultadoConcurso.adicionar(2, "B");
        resultadoConcurso.adicionar(3, "C");
        resultadoConcurso.adicionar(4, "D");
        resultadoConcurso.adicionar(5, "E");
        resultadoConcurso.adicionar(6, "F");

        System.out.println(resultadoConcurso.getValor(4));
    }
}