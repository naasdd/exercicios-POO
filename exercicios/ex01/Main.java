public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco", 1);

        banco.criarConta(1000, 500);
        banco.criarConta(200, 0);

        banco.depositar(1, 300);
        banco.sacar(1, 100);
        banco.transferir(1, 2, 400);

        banco.emitirExtrato(1);
        banco.emitirExtrato(2);
    }
}