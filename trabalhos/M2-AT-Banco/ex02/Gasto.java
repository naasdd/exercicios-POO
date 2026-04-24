import java.util.Date;

public class Gasto{
    private Date data;
    private String descricao;
    private double valor;

    public Gasto(Date data, String descricao, double valor, TipoGasto gasto, FormaPagamento forma){


    }

    public String obterDescricao(){

        return this.descricao;
    }
}