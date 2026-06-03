package br.univali.cc.prog3.banco.excecoes;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
