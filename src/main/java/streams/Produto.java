package streams;

public class Produto {
    private String descricao;
    private double preco;
    private double frete;

    public Produto(String descricao, double preco, double frete) {
        setDescricao(descricao);
        setPreco(preco);
        setFrete(frete);
    }

    public String getDescricao() {
        return this.descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFrete() {
        return frete;
    }

    private void setFrete(double frete) {
        this.frete = frete;
    }
}
