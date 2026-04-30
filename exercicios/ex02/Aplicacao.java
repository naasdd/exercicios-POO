import java.util.Date;

class Aplicacao {
    TipoGasto[] tipos = new TipoGasto[10];
    FormaPagamento[] formas = new FormaPagamento[10];
    Gasto[] gastos = new Gasto[100];

    int qtdTipos = 0;
    int qtdFormas = 0;
    int qtdGastos = 0;

    public void adicionarFormaPagamento(FormaPagamento forma) {
        formas[qtdFormas++] = forma;
    }

    public void adicionarTipoGasto(TipoGasto tipo) {
        tipos[qtdTipos++] = tipo;
    }

    public void listarGastos(int mes, int ano) {
        for (int i = 0; i < qtdGastos; i++) {
            Gasto g = gastos[i];

            int m = g.data.getMonth() + 1;
            int a = g.data.getYear() + 1900;

            if (m == mes && a == ano) {
                System.out.println(g.obterDescricao());
            }
        }
    }

    public void novoGasto(String descricao, Date data, double valor, TipoGasto tipo, FormaPagamento forma) {
        gastos[qtdGastos++] = new Gasto(data, descricao, valor, tipo, forma);
    }
}