package excecao.personalizadaA;

public class ForaDoIntervaloException extends Exception {
    private String nomeDoAtributo;

    public ForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O Numero está fora do intervalo " + this.nomeDoAtributo);
    }
}
