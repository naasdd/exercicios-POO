public class Carro extends VeiculoTerrestre {
    private double potencia;

    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
    }

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + " e potencia: " + potencia;
    }

    public double getPotencia() {
        return potencia;
    }
}
