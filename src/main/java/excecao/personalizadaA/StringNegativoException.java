package excecao.personalizadaA;

public class StringNegativoException extends RuntimeException {
    private String nomeDoAtributo;

    public StringNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("A String está negativa " + this.nomeDoAtributo);
    }
}
