public class GeradorDeGraficoDeNotaDeAluno {
    public static void main(String[] args)
	{
        double acumulador = 0;
        for(int x = 0; x < args.length; x++){
            System.out.printf("Aluno %d ", (x+1));
            int nota = Integer.parseInt(args[x]);
            for(int i = 0; i < nota; i++){
                System.out.print("*");
            }
            System.out.print("\n");
            acumulador += nota;
        }
        System.out.printf("Media: %f", (acumulador/args.length));
    }
}
