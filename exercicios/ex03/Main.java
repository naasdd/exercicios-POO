import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Organizador org = new Organizador();
        org.nome = "FIA";

        // Criar campeonato
        org.criarCampeonato(2026, "Fórmula 1");

        // ===== EQUIPE 1 =====
        Equipe ferrari = new Equipe();
        ferrari.nome = "Ferrari";

        Piloto f1 = new Piloto();
        f1.nome = "Leclerc";
        f1.licenca = 16;

        Piloto f2 = new Piloto();
        f2.nome = "Bortoleto";
        f2.licenca = 5;

        ferrari.pilotos[ferrari.qtdPilotos++] = f1;
        ferrari.pilotos[ferrari.qtdPilotos++] = f2;

        Carro fc1 = new Carro();
        fc1.numero = 16;

        Carro fc2 = new Carro();
        fc2.numero = 5;

        ferrari.carros[ferrari.qtdCarros++] = fc1;
        ferrari.carros[ferrari.qtdCarros++] = fc2;

        Mecanico fm1 = new Mecanico();
        fm1.nome = "Zé";

        ferrari.mecanicos[ferrari.qtdMecanicos++] = fm1;

        org.inscrever(ferrari);

        // ===== EQUIPE 2 =====
        Equipe redbull = new Equipe();
        redbull.nome = "Red Bull";

        Piloto r1 = new Piloto();
        r1.nome = "Verstappen";
        r1.licenca = 1;

        Piloto r2 = new Piloto();
        r2.nome = "Hadjar";
        r2.licenca = 11;

        redbull.pilotos[redbull.qtdPilotos++] = r1;
        redbull.pilotos[redbull.qtdPilotos++] = r2;

        org.inscrever(redbull);

        // ===== AUTODROMOS =====
        Autodromo interlagos = new Autodromo();
        interlagos.local = "Interlagos";

        Autodromo monaco = new Autodromo();
        monaco.local = "Monaco";

        // ===== CORRIDAS =====
        org.campeonato.definirCorrida(interlagos, new Date(126, 3, 10));
        org.campeonato.definirCorrida(monaco, new Date(126, 4, 20));

        // ===== PRINT =====
        System.out.println("Organizador: " + org.nome);
        System.out.println("Campeonato: " + org.campeonato.nome);
        System.out.println("Ano: " + org.campeonato.ano);

        System.out.println("\nEquipes cadastradas: " + org.campeonato.qtdEquipes);
        for (int i = 0; i < org.campeonato.qtdEquipes; i++) {
            System.out.println("- " + org.campeonato.equipes[i].nome);
        }

        System.out.println("\nCorridas cadastradas: " + org.campeonato.qtdCorridas);
        for (int i = 0; i < org.campeonato.qtdCorridas; i++) {
            System.out.println("- " + org.campeonato.corridas[i].autodromo.local);
        }
    }
}