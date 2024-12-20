package centralizado;

import java.util.List;

public class Pedido {

    private Cliente cliente;

    private List<LinhaDePedido> linhasDePedido;

    public Pedido(Cliente cliente, List<LinhaDePedido> linhasDePedido) {
        this.cliente = cliente;
        this.linhasDePedido = linhasDePedido;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Double calcularPreco(){
        Double precoFinal = 0.0;
        for(LinhaDePedido linhaDePedido: linhasDePedido){
            Integer quantidade = linhaDePedido.obterQuantidade();
            Produto produto = linhaDePedido.obterProduto();
            Double preco = produto.obterDetalhesPreco();

            Double precoBase = calcularPrecoBase(quantidade, preco);

            Double precoComDesconto = calcularDescontos(precoBase);

            precoFinal += precoComDesconto;

        }

        return precoFinal;
    }

    public Double calcularPrecoBase(Integer quantidade, Double preco){
        return preco * quantidade;
    }

    public Double calcularDescontos(Double precoBase){
        Double percentualDesconto = cliente.obterInformacaoDeDesconto();

        return precoBase - (precoBase * (percentualDesconto/100));
    }
}
