import java.util.Date;

class Gasto {
    Date data;
    String descricao;
    double valor;
    TipoGasto tipo;
    FormaPagamento forma;

    public Gasto(Date data, String descricao, double valor, TipoGasto tipo, FormaPagamento forma) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.forma = forma;
    }

    public String obterDescricao() {
        return descricao;
    }
}