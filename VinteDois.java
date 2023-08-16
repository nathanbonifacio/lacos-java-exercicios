
import java.util.Scanner;
public class VinteDois {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int somaId = 0;
		int somaValores = 0;
		int somaTotal = 0;
		double media = 0;
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("Informe o codigo do produto: ");
			int id = scanner.nextInt();
			System.out.print("Informe o valor do produto: ");
			int valor = scanner.nextInt();
			
			if(valor > maior){
				int aux = maior;
				maior = valor;
			}		
			somaId += id;
			somaValores += valor;
			somaTotal = somaId + somaValores;
			media = somaTotal / 5;
		}
		System.out.println();
		System.out.println("MAIOR PRECO: " + maior);
		System.out.println("MEDIA DOS NUMEROS: " + media);
	}
}

