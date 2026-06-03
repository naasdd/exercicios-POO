package br.univali.cc.prog3.banco.dominio;

import br.univali.cc.prog3.banco.excecoes.ContaInexistenteException;
import br.univali.cc.prog3.banco.excecoes.ContaJaExisteException;
import br.univali.cc.prog3.banco.excecoes.SaldoInsuficienteException;
import br.univali.cc.prog3.banco.excecoes.ValorInvalidoException;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nome;
    private int numero;
    private Map<Integer, ContaCorrente> contas = new HashMap<>();
    
    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    public void criarConta(int numeroConta, double saldoInicial) throws ContaJaExisteException {
        if (contas.containsKey(numeroConta)) {
            throw new ContaJaExisteException("Conta " + numeroConta + " já existe.");
        }
        this.contas.put(numeroConta, new ContaCorrente(numeroConta, saldoInicial));
    }

    public void criarConta(int numeroConta, double saldoInicial, double limite) throws ContaJaExisteException {
        if (contas.containsKey(numeroConta)) {
            throw new ContaJaExisteException("Conta " + numeroConta + " já existe.");
        }
        this.contas.put(numeroConta, new ContaCorrente(numeroConta, saldoInicial, limite));
    }

    private ContaCorrente localizarConta(int numero) throws ContaInexistenteException {
        ContaCorrente conta = this.contas.get(numero);
        if (conta == null) {
            throw new ContaInexistenteException("Conta " + numero + " inexistente.");
        }
        return conta;
    }
    
    public void depositar(int numero, double valor) throws ContaInexistenteException, ValorInvalidoException {
        localizarConta(numero).depositar(valor);
    }
    
    public void sacar(int numero, double valor) throws ContaInexistenteException, ValorInvalidoException, SaldoInsuficienteException {
        localizarConta(numero).sacar(valor); 
    }
    
    public void transferir(int numeroOrigem, int numeroDestino, double valor) throws ContaInexistenteException, ValorInvalidoException, SaldoInsuficienteException {
        ContaCorrente origem = localizarConta(numeroOrigem);
        ContaCorrente destino = localizarConta(numeroDestino);
        
        origem.sacar(valor);
        destino.depositar(valor);
    }
    
    public String emitirExtrato(int numero) throws ContaInexistenteException {
        return localizarConta(numero).emitirExtrato();
    }

    public String getNome() {
        return nome;
    }
}
