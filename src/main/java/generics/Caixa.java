package generics;

public class Caixa<T> {
    private T coisa;

    public void guardarCoisa(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return this.coisa;
    }
}
