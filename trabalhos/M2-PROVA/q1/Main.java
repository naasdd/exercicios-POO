public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro(150, "civic", "ABC1234");
        carro1.atribuirMotorista("jose");
        System.out.println(carro1.detalhar());
        
        Caminhao caminhao1 = new Caminhao(10000, "scania", "XYZ9876");
        caminhao1.atribuirMotorista("gabriel");
        System.out.println(caminhao1.detalhar());

        Helicoptero helicoptero1 = new Helicoptero("HelicopteroFoda", "HLFD");
        helicoptero1.atribuirPiloto("santos");
        System.out.println(helicoptero1.obterDescricaoCompleta());
        
        Barco barco1 = new Barco("titanic");
        barco1.informarCapitao("gomes");
        System.out.println(barco1.getNome());
    }
}
