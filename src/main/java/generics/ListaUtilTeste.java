package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> teste = Arrays.asList("asdasd", "sdasdasd");
        List<Integer> teste2 = Arrays.asList(1, 2, 3, 4, 5);

        String ultimoDoTeste = ListaUtil.getUltimo(teste);
        String ultimoDoTeste2 = ListaUtil.getUltimoV2(teste2);

        System.out.println(ultimoDoTeste);
        System.out.println(ultimoDoTeste2);
    }
}
