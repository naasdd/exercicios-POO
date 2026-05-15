public class Caminhao extends VeiculoTerrestre {
    private double capacidadeCarga;

    public Caminhao(double capacidade, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidade;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " e capacidade de carga: " + capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
}
