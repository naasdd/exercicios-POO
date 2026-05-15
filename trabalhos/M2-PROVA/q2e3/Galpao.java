public class Galpao {
    private Veiculo[] veiculos;
    private int contador;

    public Galpao() {
        this.veiculos = new Veiculo[50];
        this.contador = 0;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (contador < veiculos.length) {
            veiculos[contador] = veiculo;
            contador++;
        }
    }

    public void imprimirRelacaoVeiculos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(veiculos[i].obterDescricao());
        }
    }
}
