package excecao.personalizadaA;

public class NumeroNegativoException extends RuntimeException {
    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O Atributo está negativo " + this.nomeDoAtributo);
    }
}
