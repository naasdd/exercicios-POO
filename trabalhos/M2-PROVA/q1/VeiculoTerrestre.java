public abstract class VeiculoTerrestre {
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

    public String getPlaca() {
        return placa;
    }

    public String detalhar() {
        return "o modelo " + this.modelo + " de placa " + this.placa + " possui o motorista " + this.motorista;
    }
}
