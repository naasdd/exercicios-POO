public abstract class VeiculoTerrestre implements Veiculo {
    protected String modelo;
    protected String placa;
    protected String motorista;

    public VeiculoTerrestre(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void atribuirMotorista(String nome) {
        this.motorista = nome;
    }

    @Override
    public String obterDescricao() {
        return "o modelo de " + this.modelo + " de placa " + this.placa + " possui o motorista " + this.motorista;
    }
}
