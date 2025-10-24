package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardarCoisa("Isso é uma String");


        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardarCoisa(2.1);
    }
}
