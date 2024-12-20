package descentralizado;

import java.util.List;

public class Pedido {
    private Double valorBase;
    private List<LinhaDePedido> linhaasDePedido;
    private Cliente cliente;
    
    public Double obterValorBase(){
        return valorBase;
    }

    public Double calcularPreco(){
       for(LinhaDePedido linhaDePedido: linhaasDePedido){
        valorBase += linhaDePedido.calcularPreco();
       }

       return cliente.obterValorComDesconto(this);
    }
}
