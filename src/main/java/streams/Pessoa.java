package streams;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private List<Double> nota;

    public Pessoa(String nome, int idade, String sexo, List<Double> nota) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /*public Double getNota() {
        return this.nota.stream().map(Double::valueOf);
    }*/

    private void setNota(List<Double> nota) {
        this.nota = nota;
    }


}
