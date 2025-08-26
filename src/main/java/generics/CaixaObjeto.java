package generics;

public class CaixaObjeto {
    private Object coisa;

    public void guardarCoisa(Object coisa){
        this.coisa = coisa;
    }

    public Object abrir(){
        return this.coisa;
    }
}
