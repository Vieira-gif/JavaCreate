package generics;

import java.util.List;

public class ListaUtil {
    public static <T> T getUltimo(List<T> lista){
        return lista.get(lista.size()-1);
    }

    public static <A, B, C> C getUltimoV2(List<A> lista){
        C retorno = null;
        return retorno;
    }
}
