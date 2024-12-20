package centralizado;

public class Cliente {
    private Double percentualDeDesconto;
    
    public Cliente() {
    }
    public Double obterInformacaoDeDesconto(){
        return percentualDeDesconto;
    }

    public Double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    
    public void setPercentualDeDesconto(Double percentualDeDesconto) {
        this.percentualDeDesconto = percentualDeDesconto;
    }
}
