class Organizador {
    String nome;
    Campeonato campeonato;

    public void criarCampeonato(int ano, String nome) {
        campeonato = new Campeonato();
        campeonato.ano = ano;
        campeonato.nome = nome;
    }

    public boolean inscrever(Equipe equipe) {
        if (campeonato != null) {
            campeonato.equipes[campeonato.qtdEquipes++] = equipe;
            return true;
        }
        return false;
    }
}