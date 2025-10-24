package murmuring;

import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    //CONSTRUCTOR

    Aluno(String nome, List<Double> notas) {
        setNome(nome);
        setNotas(notas);
    }

    // SETTERS
    private void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    // GETTERS
    public List<Double> getNotas() {
        return notas;
    }
    public String getNome() {
        return nome;
    }

    //METHOD
    public static double geraNota () {
        return Math.random() * 10;
    }
}
