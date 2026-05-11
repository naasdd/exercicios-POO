public class Fatura implements Pagavel {
    private String tipoFatura;
    private double valorFatura;

    public Fatura(String tipoFatura, double valorFatura) {
        this.tipoFatura = tipoFatura;
        this.valorFatura = valorFatura;
    }

    @Override
    public double calcularValorPagar() {
        return valorFatura;
    }
}
