package br.univali.cc.prog3.banco.dominio;

import br.univali.cc.prog3.banco.excecoes.SaldoInsuficienteException;
import br.univali.cc.prog3.banco.excecoes.ValorInvalidoException;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private boolean especial;
    private double limite;
    private int numero;
    private double saldo;
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    public ContaCorrente(int numero, double saldoInicial) {
        this.especial = false;
        this.limite = 0;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.criarMovimentacao("Saldo inicial", 'C', saldoInicial);
    }

    public ContaCorrente(int numero, double saldoInicial, double limite) {
        this.especial = true;
        this.limite = limite;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.criarMovimentacao("Saldo inicial", 'C', saldoInicial);
    }
    
    public int getNumeroConta() {
        return this.numero;
    }
    
    protected void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito deve ser positivo.");
        }
        this.saldo += valor;
        this.criarMovimentacao("Depósito", 'C', valor);
    }
    
    protected void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser positivo.");
        }
        if (this.saldo + this.limite < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        this.criarMovimentacao("Saque", 'D', valor);
    }
    
    private void criarMovimentacao(String descricao, char tipo, double valor) {
        movimentacoes.add(new Movimentacao(descricao, tipo, valor));
    }
    
    protected String emitirExtrato() {
        String extrato = "Extrato bancário C/C "+numero;
        for(Movimentacao movimentacao : movimentacoes){
            extrato += "\n"+movimentacao.getMovimentacao();
        }
        extrato += "\n Saldo final R$ "+this.saldo;
        if (especial) {
            extrato += "\n Limite R$ "+this.limite;
        }
        return extrato;
    }
}
