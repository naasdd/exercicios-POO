public class Carro extends VeiculoTerrestre {
    private double potencia;

    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }
}
