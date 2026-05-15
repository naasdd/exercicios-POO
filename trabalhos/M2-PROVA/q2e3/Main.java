import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Galpao galpao = new Galpao();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("\n--- menu ---");
            System.out.println("1 - adicionar carro");
            System.out.println("2 - adicionar caminhao");
            System.out.println("3 - adicionar barco");
            System.out.println("4 - adicionar helicoptero");
            System.out.println("5 - imprimir veiculos");
            System.out.println("0 - sair");
            System.out.print("digite sua opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("potencia: ");
                    double pot = Double.parseDouble(scanner.nextLine());

                    System.out.print("modelo: ");
                    String modCar = scanner.nextLine();

                    System.out.print("placa: ");
                    String placaCar = scanner.nextLine();

                    Carro c = new Carro(pot, modCar, placaCar);
                    System.out.print("motorista: ");
                    c.atribuirMotorista(scanner.nextLine());
                    galpao.adicionarVeiculo(c);

                    break;
                case 2:
                    System.out.print("capacidade: ");
                    double cap = Double.parseDouble(scanner.nextLine());

                    System.out.print("modelo: ");
                    String modCam = scanner.nextLine();

                    System.out.print("placa: ");
                    String placaCam = scanner.nextLine();

                    Caminhao cam = new Caminhao(cap, modCam, placaCam);
                    System.out.print("motorista: ");
                    cam.atribuirMotorista(scanner.nextLine());
                    galpao.adicionarVeiculo(cam);
                    
                    break;
                case 3:
                    System.out.print("nome: ");
                    String nomeBarco = scanner.nextLine();
                    Barco b = new Barco(nomeBarco);

                    System.out.print("capitao: ");
                    b.informarCapitao(scanner.nextLine());
                    galpao.adicionarVeiculo(b);

                    break;
                case 4:
                    System.out.print("modelo: ");
                    String modHeli = scanner.nextLine();

                    System.out.print("sigla: ");
                    String siglaHeli = scanner.nextLine();

                    Helicoptero h = new Helicoptero(modHeli, siglaHeli);
                    System.out.print("piloto: ");
                    h.atribuirPiloto(scanner.nextLine());
                    galpao.adicionarVeiculo(h);

                    break;
                case 5:
                    galpao.imprimirRelacaoVeiculos();
                    
                    break;
            }
        } while (opcao != 0);
    }
}
