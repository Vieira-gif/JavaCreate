package excecao;

public class CheckUnchecked {
    public static void main(String[] args) throws Exception {
        try {
            gerarError1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            gerarError2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void gerarError1 () {
        throw new RuntimeException("Erro 1");
    }

    static void gerarError2 () throws Exception {
        throw new Exception("Erro 2");
    }
}
