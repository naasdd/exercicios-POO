import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aplicacao app = new Aplicacao();

        // Tipos
        TipoGasto comida = new TipoGasto();
        comida.setdescricao("Comida");

        TipoGasto transporte = new TipoGasto();
        transporte.setdescricao("Transporte");

        // Formas
        FormaPagamento cartao = new FormaPagamento();
        cartao.setdescricao("Cartao");

        FormaPagamento dinheiro = new FormaPagamento();
        dinheiro.setdescricao("Dinheiro");

        // Adicionando
        app.adicionarTipoGasto(comida);
        app.adicionarTipoGasto(transporte);

        app.adicionarFormaPagamento(cartao);
        app.adicionarFormaPagamento(dinheiro);

        // Criando gastos
        app.novoGasto("Almoço", new Date(126, 3, 10), 30.0, comida, cartao); // abril 2026
        app.novoGasto("Jantar", new Date(126, 3, 15), 45.0, comida, dinheiro);
        app.novoGasto("Uber", new Date(126, 2, 20), 20.0, transporte, cartao); // março 2026
        app.novoGasto("Busão", new Date(126, 3, 5), 5.0, transporte, dinheiro);

        // Listagem
        System.out.println("=== GASTOS ABRIL 2026 ===");
        app.listarGastos(4, 2026);

        System.out.println("\n=== GASTOS MARÇO 2026 ===");
        app.listarGastos(3, 2026);
    }
}