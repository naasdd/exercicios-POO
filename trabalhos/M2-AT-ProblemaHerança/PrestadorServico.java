public class PrestadorServico implements Pagavel {
    private String nome;
    private double valorServico;

    public PrestadorServico(String nome, double valorServico) {
        this.nome = nome;
        this.valorServico = valorServico;
    }

    @Override
    public double calcularValorPagar() {
        return valorServico;
    }
}
