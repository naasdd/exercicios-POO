public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularValorPagar() {
        return salario;
    }
}
