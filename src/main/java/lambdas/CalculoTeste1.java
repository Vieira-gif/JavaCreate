package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(1,3));


        calculo = new Multiplicao();
        System.out.println(calculo.executar(1,3));


    }
}
