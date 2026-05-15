public class Barco implements Veiculo {
    private String nome;
    private String capitao;

    public Barco(String nome) {
        this.nome = nome;
    }

    public void informarCapitao(String nome) {
        this.capitao = nome;
    }

    @Override
    public String obterDescricao() {
        return "o barco " + this.nome + " possui o capitao " + this.capitao;
    }
}
