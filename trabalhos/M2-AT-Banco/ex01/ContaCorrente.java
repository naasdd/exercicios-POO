public class ContaCorrente {
    private boolean especial;
    private double limite;
    private int numero;
    private double saldo;
    private Movimentacao[] movimentacoes = new Movimentacao[100];
    private int totalMovimentacoes = 0;

    public ContaCorrente(int numero, double saldoInicial, double limite) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
        this.especial = limite > 0;
    }

    public int getNumeroConta() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        movimentacoes[totalMovimentacoes++] = new Movimentacao("Deposito", 'C', valor);
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > saldo + limite) return false;
        saldo -= valor;
        movimentacoes[totalMovimentacoes++] = new Movimentacao("Saque", 'D', valor);
        return true;
    }

    public String emitirExtrato() {
        String extrato = "Extrato conta " + numero + "\n";
        for (int i = 0; i < totalMovimentacoes; i++) {
            extrato += movimentacoes[i].getMovimentacao() + "\n";
        }
        extrato += "Saldo: R$ " + saldo;
        return extrato;
    }
}