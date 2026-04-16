public class Numero
{
	public static void main(String[] args)
	{
		if(args.length > 0){
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			double media = 0;
			double soma = 0;
			
			for(int i = 0; i < args.length; i++){
				int atual = Integer.parseInt(args[i]);
				if(atual > maior){
					maior = atual;
				}
				else if(atual < menor){
					menor = atual;
				}
				soma += atual;
			}
			System.out.printf("Maior: %d, Menor: %d, Média %f", maior, menor, media);
		}
		else{
			System.out.println("Passe um valor");

		}

	}
}