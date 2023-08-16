

import java.util.Scanner;
public class Dezenove {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double valorTotalEstoque = 0;
		double media = 0;
		double soma = 0;
		int qtt = 0;
		double valorMerc = 0;
	
		System.out.print("Qual o valor da mercadoria?: ");
		valorMerc = scanner.nextDouble();
		System.out.print("MAIS MERCADORIAS (S/N): ");
		char op = scanner.next().charAt(0);
		switch(op)
		{
			case 'S':
					while(op == 'S'|| op == 's')
					{
						System.out.print("Qual o valor da mercadoria?: ");
						valorMerc = scanner.nextDouble();
						qtt++;
						soma += valorMerc;
						media = soma / qtt; 
						System.out.println();
						System.out.print("MAIS MERCADORIAS (S/N): ");
						op = scanner.next().charAt(0);
					}
					break;
					
			case 'N':
				break;
		}
		System.out.println("Valor total em estque: " + soma);
		System.out.println("Media: " + media);
		
	}
}

