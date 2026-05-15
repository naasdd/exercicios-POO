public class Helicoptero {
    private String modelo;
    private String sigla;
    private String piloto;

    public Helicoptero(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
    }

    public void atribuirPiloto(String nome) {
        this.piloto = nome;
    }

    public String obterDescricaoCompleta() {
        return "O modelo de " + this.modelo + " de sigla " + this.sigla + " possui o piloto " + this.piloto;
    }
}