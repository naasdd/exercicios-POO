import java.util.Date;

public class Aplicacao{
    public TipoGasto tipos;
    public FormaPagamento formas;

    
    public void adicionarFormaPagamento(FormaPagamento forma){

    }

    public void adicionarTipoGasto(TipoGasto gasto){

    }

    public void listarGastos(int mes, int ano){

    }

    public void novoGasto(String descricao, Date data, double valor, TipoGasto tipo, FormaPagamento forma){

    }

    public class Gasto{
        private Date data;
        private String descricao;
        private double valor;
        private TipoGasto tipo;
        private FormaPagamento forma;
    
        public Gasto(Date data, String descricao, double valor, TipoGasto gasto, FormaPagamento forma){
    
    
        }
    
        public String obterDescricao(){
    
            return this.descricao;
        }
    }
}
