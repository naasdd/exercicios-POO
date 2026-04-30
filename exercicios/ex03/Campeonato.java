import java.util.Date;

class Campeonato {
    int ano;
    String nome;

    Equipe[] equipes = new Equipe[12];
    Corrida[] corridas = new Corrida[20];

    int qtdEquipes = 0;
    int qtdCorridas = 0;

    public void definirCorrida(Autodromo autodromo, Date data) {
        Corrida c = new Corrida();
        c.autodromo = autodromo;
        c.data = data;
        corridas[qtdCorridas++] = c;
    }
}