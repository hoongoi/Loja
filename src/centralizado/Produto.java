package centralizado;

public class Produto {

    private Double preco;

    public Produto(Double preco) {
        this.preco = preco;
    }
    public Double obterDetalhesPreco() {
        return preco;
    }

    public Double getPreco() {
        return preco;
    }



    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
