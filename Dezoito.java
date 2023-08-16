

import java.util.Scanner;
public class Dezoito {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double valorTotalEmEstoque = 0;
		double media = 0;
		
		System.out.print("Digite o numero total de mercadorias no estoque: ");
		int qttMercadorias = scanner.nextInt();
		System.out.println();
		
		for(int i = 1; i <= qttMercadorias; i++)
		{
			System.out.println("Digite o valor total de cada mercadoria: ");
			System.out.print("Mercadoria " + i + ":  ");
			double valorMercadoria = scanner.nextDouble();
			valorTotalEmEstoque += valorMercadoria;
			media = valorTotalEmEstoque / qttMercadorias;
		}
		System.out.println();
		System.out.println("Valor total em estoque: " + valorTotalEmEstoque);
		System.out.println("Media de valor das mercadorias" + media);
	}
}

