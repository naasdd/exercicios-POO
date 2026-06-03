package br.univali.cc.prog3.banco.visao;

import br.univali.cc.prog3.banco.dominio.Banco;
import br.univali.cc.prog3.banco.excecoes.ContaInexistenteException;
import br.univali.cc.prog3.banco.excecoes.ContaJaExisteException;
import br.univali.cc.prog3.banco.excecoes.SaldoInsuficienteException;
import br.univali.cc.prog3.banco.excecoes.ValorInvalidoException;
import java.util.Scanner;

public class BancoGUI {
    private Banco banco;
    
    public String lerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

    public BancoGUI(Banco banco) {
        this.banco = banco;
    }
    
    public void menu() {
        char opcao = ' ';
        do {
            System.out.println("\nMenu do "+this.banco.getNome());
            System.out.println("1 - Criar conta simples");
            System.out.println("2 - Criar conta especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Extrato");
            System.out.println("S - Sair");
            String entrada = lerValor("Selecione uma opção");
            if (entrada.isEmpty()) continue;
            opcao = entrada.toUpperCase().charAt(0);
            switch (opcao) {
                case '1': criarContaSimples();break;
                case '2': criarContaEspecial();break;
                case '3': depositar();break;
                case '4': sacar();break;
                case '5': transferir();break;
                case '6': extrato();break;
                case 'S': break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 'S');
    }

    private void criarContaSimples() {
        try {
            int numeroConta = Integer.parseInt(lerValor("Informe o número da conta"));
            double saldoInicial = Double.parseDouble(lerValor("Informe o saldo inicial"));
            this.banco.criarConta(numeroConta, saldoInicial);
        } catch (NumberFormatException | ContaJaExisteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void criarContaEspecial() {
        try {
            int numeroConta = Integer.parseInt(lerValor("Informe o número da conta"));
            double saldoInicial = Double.parseDouble(lerValor("Informe o saldo inicial"));
            double limite = Double.parseDouble(lerValor("Informe o limite da conta"));
            this.banco.criarConta(numeroConta, saldoInicial, limite);
        } catch (NumberFormatException | ContaJaExisteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void depositar() {
        try {
            int numero = Integer.parseInt(lerValor("Informe o numero da conta"));
            double valor = Double.parseDouble(lerValor("Informe o valor para depósito"));
            this.banco.depositar(numero, valor);
        } catch (NumberFormatException | ContaInexistenteException | ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    private void sacar() {
        try {
            int numero = Integer.parseInt(lerValor("Informe o numero da conta"));
            double valor = Double.parseDouble(lerValor("Informe o valor para saque"));
            this.banco.sacar(numero, valor);
        } catch (NumberFormatException | ContaInexistenteException | ValorInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }    
    
    private void transferir() {
        try {
            int numeroOrigem = Integer.parseInt(lerValor("Informe o numero da conta de origem"));
            int numeroDestino = Integer.parseInt(lerValor("Informe o numero da conta de destino"));
            double valor = Double.parseDouble(lerValor("Informe o valor para transferência"));
            this.banco.transferir(numeroOrigem, numeroDestino, valor);
        } catch (NumberFormatException | ContaInexistenteException | ValorInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }    
    
    private void extrato(){
        try {
            int numero = Integer.parseInt(lerValor("Informe o numero da conta"));
            System.out.println(this.banco.emitirExtrato(numero));
        } catch (NumberFormatException | ContaInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
