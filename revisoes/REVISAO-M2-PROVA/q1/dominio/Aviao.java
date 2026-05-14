package dominio;

public class Aviao {

    private String modelo;
    private String sigla;
    private String piloto;

    public Aviao(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
    }

    public void setPiloto(String nome) {
        this.piloto = nome;
    }

    public String obterDescricaoCompleta() {
        return "Modelo: " + modelo + " | Sigla: " + sigla + " | Piloto: " + piloto;
    }
}
