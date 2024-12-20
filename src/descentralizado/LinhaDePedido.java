package descentralizado;

public class LinhaDePedido {

    private Produto produto;
    private Integer quantidade;

    public Double calcularPreco(){
        Double preco = produto.obterPreco();
        return quantidade * preco;
   }

}
