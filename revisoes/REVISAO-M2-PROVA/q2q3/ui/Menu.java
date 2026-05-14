package ui;

import dominio.Aviao;
import dominio.Barco;
import dominio.Caminhao;
import dominio.Carro;
import dominio.Hangar;
import dominio.Veiculo;
import java.util.Scanner;

public class Menu {

    private Hangar hangar;
    private Scanner scanner;

    public Menu() {
        this.hangar = new Hangar();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("Escolha uma opcao: ");
            processarOpcao(opcao);
        } while (opcao != 0);

        scanner.close();
        System.out.println("Sistema encerrado. Ate logo!");
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n====== HANGAR DE AYRTON POWERS ======");
        System.out.println("1 - Cadastrar Carro");
        System.out.println("2 - Cadastrar Caminhao");
        System.out.println("3 - Cadastrar Aviao");
        System.out.println("4 - Cadastrar Barco");
        System.out.println("5 - Listar todos os veiculos");
        System.out.println("0 - Sair");
        System.out.println("=====================================");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarCarro();
                break;
            case 2:
                cadastrarCaminhao();
                break;
            case 3:
                cadastrarAviao();
                break;
            case 4:
                cadastrarBarco();
                break;
            case 5:
                hangar.imprimirRelacaoVeiculos();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    private void cadastrarCarro() {
        System.out.println("\n-- Cadastro de Carro --");
        String modelo = lerTexto("Modelo: ");
        String placa = lerTexto("Placa: ");
        double potencia = lerDouble("Potencia (cv): ");
        String motorista = lerTexto("Motorista: ");

        Carro carro = new Carro(potencia, modelo, placa);
        carro.setMotorista(motorista);
        hangar.adicionarVeiculo(carro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    private void cadastrarCaminhao() {
        System.out.println("\n-- Cadastro de Caminhao --");
        String modelo = lerTexto("Modelo: ");
        String placa = lerTexto("Placa: ");
        double capacidade = lerDouble("Capacidade de carga (ton): ");
        String motorista = lerTexto("Motorista: ");

        Caminhao caminhao = new Caminhao(capacidade, modelo, placa);
        caminhao.setMotorista(motorista);
        hangar.adicionarVeiculo(caminhao);
        System.out.println("Caminhao cadastrado com sucesso!");
    }

    private void cadastrarAviao() {
        System.out.println("\n-- Cadastro de Aviao --");
        String modelo = lerTexto("Modelo: ");
        String sigla = lerTexto("Sigla: ");
        String piloto = lerTexto("Piloto: ");

        Aviao aviao = new Aviao(modelo, sigla);
        aviao.setPiloto(piloto);
        hangar.adicionarVeiculo(aviao);
        System.out.println("Aviao cadastrado com sucesso!");
    }

    private void cadastrarBarco() {
        System.out.println("\n-- Cadastro de Barco --");
        String nome = lerTexto("Nome do barco: ");
        String capitao = lerTexto("Capitao: ");

        Barco barco = new Barco(nome);
        barco.setCapitao(capitao);
        hangar.adicionarVeiculo(barco);
        System.out.println("Barco cadastrado com sucesso!");
    }

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada invalida. " + mensagem);
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada invalida. " + mensagem);
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
}
