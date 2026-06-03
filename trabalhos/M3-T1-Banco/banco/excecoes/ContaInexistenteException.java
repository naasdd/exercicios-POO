package br.univali.cc.prog3.banco.excecoes;

public class ContaInexistenteException extends Exception {
    public ContaInexistenteException(String message) {
        super(message);
    }
}
