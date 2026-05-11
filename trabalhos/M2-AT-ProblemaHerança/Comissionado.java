public class Comissionado extends Funcionario {
    private double valorBase;
    private double totalVendas;
    private double taxaComissao;

    public Comissionado(String nome, double valorBase, double totalVendas, double taxaComissao) {
        super(nome);
        this.valorBase = valorBase;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularValorPagar() {
        return valorBase + (totalVendas * taxaComissao);
    }
}
