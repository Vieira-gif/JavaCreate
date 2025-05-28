package lambdas;

public class Multiplicao implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
