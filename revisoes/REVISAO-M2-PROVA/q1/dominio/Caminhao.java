package dominio;

public class Caminhao extends VeiculoTerrestre {

    private double capacidadeCarga;

    public Caminhao(double capacidadeCarga, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String detalhar() {
        return super.detalhar() + " | Capacidade de Carga: " + capacidadeCarga + " ton";
    }
}
