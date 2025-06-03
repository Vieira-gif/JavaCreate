package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.test(10)); // True - é par
        System.out.println(isPar.test(23)); // False - não é par

        System.out.println(isTresDigitos.test(104)); // True - tres digitos
        System.out.println(isTresDigitos.test(23)); // False - não tem tres digitos

        System.out.println(isPar.and(isTresDigitos).test(104)); // True - é par e tem 3 digitos
        System.out.println(isPar.or(isTresDigitos).test(331)); // True - não é par e tem 3 digitos
        System.out.println(isTresDigitos.or(isPar).test(23)); // False - não é par e não tem 3 digitos

        System.out.println(isPar.and(isTresDigitos).negate().test(104)); // False - Negate(negação logica)
        System.out.println(isTresDigitos.or(isPar).negate().test(23)); // True - Negate(negação logica)


    }
}
