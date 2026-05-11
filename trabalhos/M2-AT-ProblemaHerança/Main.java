public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        empresa.adicionarGasto(new Fatura("Energia", 500.0));
        empresa.adicionarGasto(new PrestadorServico("Consultor", 1200.0));
        empresa.adicionarGasto(new Horista("Joao", 160, 20.0));
        empresa.adicionarGasto(new Comissionado("Maria", 2000.0, 5000.0, 0.1));
        empresa.adicionarGasto(new Assalariado("Pedro", 3000.0));

        System.out.println("Total de gastos: R$ " + empresa.calcularTotalGastos());
    }
}
