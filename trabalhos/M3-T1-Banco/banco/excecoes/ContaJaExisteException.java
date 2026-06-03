package br.univali.cc.prog3.banco.excecoes;

public class ContaJaExisteException extends Exception {
    public ContaJaExisteException(String message) {
        super(message);
    }
}
