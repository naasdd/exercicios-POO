package dominio;

public class Hangar {

    private Veiculo[] veiculos;
    private int totalVeiculos;

    public Hangar() {
        this.veiculos = new Veiculo[999];
        this.totalVeiculos = 0;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (totalVeiculos < veiculos.length) {
            veiculos[totalVeiculos] = veiculo;
            totalVeiculos++;
        } else {
            System.out.println("Hangar cheio! Nao e possivel adicionar mais veiculos.");
        }
    }

    public void imprimirRelacaoVeiculos() {
        if (totalVeiculos == 0) {
            System.out.println("Nenhum veiculo cadastrado no hangar.");
            return;
        }
        System.out.println("\n===== RELACAO DE VEICULOS =====");
        for (int i = 0; i < totalVeiculos; i++) {
            System.out.println((i + 1) + ". " + veiculos[i].obterDescricao());
        }
        System.out.println("================================\n");
    }
}
