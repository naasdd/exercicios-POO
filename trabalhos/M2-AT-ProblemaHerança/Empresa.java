public class Empresa {
    private double caixa;
    private Pagavel[] listaGastos;
    private int contador = 0;

    public Empresa(int capacidade) {
        this.listaGastos = new Pagavel[capacidade];
    }

    public void adicionarGasto(Pagavel gasto) {
        if (contador < listaGastos.length) {
            listaGastos[contador++] = gasto;
        }
    }

    public double calcularTotalGastos() {
        double total = 0;
        for (Pagavel gasto : listaGastos) {
            if (gasto != null) {
                total += gasto.calcularValorPagar();
            }
        }
        return total;
    }
}
