
import java.util.Scanner;
public class VinteUm {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		double maior = 0;
		
		System.out.print("Informe uma Quantidade: ");
		int numQuant = scanner.nextInt();
		System.out.println();
		
		for(int i = 1; i <= numQuant; i++)
		{
			System.out.print("Digite um Numero: ");
			double num = scanner.nextDouble();
			if(num > maior){
				double aux = maior;
				maior = num;
			}
			
			soma += num;
			media = soma / numQuant;
			
		}
		System.out.println();
		System.out.println("MAIOR NUMERO LIDO: " + maior);
		System.out.println("MEDIA DOS NUMEROS LIDOS: " + media);
	}
}

