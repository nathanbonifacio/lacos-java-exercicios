


public class Dezesseis {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		
		int soma = 0;
		double media = 0;
		int quantidade = 0;
		for(int i = 15; i <= 100; i++)
		{
			quantidade++;
			soma = soma + i;
			media = soma / quantidade;
		}
		System.out.println("Media: " + media);
	}
}

