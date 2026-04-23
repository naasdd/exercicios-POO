public class Banco {
    private String nome;
    private int numero;
    private ContaCorrente[] contas = new ContaCorrente[100];
    private int totalContas = 0;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void criarConta(double saldoInicial) {
        int num = totalContas + 1;
        contas[totalContas++] = new ContaCorrente(num, saldoInicial);
        System.out.println("Conta " + num + " criada.");
    }

    public void criarConta(double saldoInicial, double limite) {
        int num = totalContas + 1;
        contas[totalContas++] = new ContaCorrente(num, saldoInicial, limite);
        System.out.println("Conta " + num + " criada.");
    }

    public void depositar(int conta, double valor) {
        ContaCorrente c = localizarConta(conta);
        if (c != null)
            c.depositar(valor);
    }

    public void emitirExtrato(int conta) {
        ContaCorrente c = localizarConta(conta);
        if (c != null)
            System.out.println(c.emitirExtrato());
    }

    public void excluirConta(int conta) {
        for (int i = 0; i < totalContas; i++) {
            if (contas[i].getNumeroConta() == conta) {
                contas[i] = contas[--totalContas];
                contas[totalContas] = null;
                return;
            }
        }
    }

    private ContaCorrente localizarConta(int conta) {
        for (int i = 0; i < totalContas; i++) {
            if (contas[i].getNumeroConta() == conta)
                return contas[i];
        }
        return null;
    }

    public void sacar(int conta, double valor) {
        ContaCorrente c = localizarConta(conta);
        if (c != null && !c.sacar(valor))
            System.out.println("Saldo insuficiente.");
    }

    public void transferir(int contaOrigem, int contaDestino, double valor) {
        ContaCorrente origem = localizarConta(contaOrigem);
        ContaCorrente destino = localizarConta(contaDestino);
        if (origem != null && destino != null) {
            if (origem.sacar(valor))
                destino.depositar(valor);
            else
                System.out.println("Saldo insuficiente para transferencia.");
        }
    }

}