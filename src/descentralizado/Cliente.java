package descentralizado;

public class Cliente {
    private Double desconto;

    public Double obterValorComDesconto(Pedido pedido){
        Double valorBase = pedido.obterValorBase();
        return valorBase * (desconto/100);
    }
}
