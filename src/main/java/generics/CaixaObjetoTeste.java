package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaObjetoA = new CaixaObjeto();

        caixaObjetoA.guardarCoisa(2.3);
        Double coisaA = (Double) caixaObjetoA.abrir();

        CaixaObjeto caixaObjetoB = new CaixaObjeto();

        caixaObjetoB.guardarCoisa("Isso é uma String");
        String coisaB = (String) caixaObjetoB.abrir();

    }
}
