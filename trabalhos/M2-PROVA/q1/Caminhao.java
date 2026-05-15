public class Caminhao extends VeiculoTerrestre {
    private double capacidadeCarga;

    public Caminhao(double capacidade, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidade;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
}
