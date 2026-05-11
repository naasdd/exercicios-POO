public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularValorPagar() {
        return horasTrabalhadas * valorPorHora;
    }
}
