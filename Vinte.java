

import java.util.Scanner;
public class Vinte {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
	
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(int i = 1; i <= 5; i++)
		{
			System.out.print("Digite um numero: ");
			int numero = scanner.nextInt();
			
			if(numero > maior){
				//aux = maior;
				maior = numero;
			}
			
			if(numero < menor){
				//aux = menor;
				menor = numero;		
			}
		}
		System.out.println();
		System.out.println("MAIOR NUMERO: " + maior);
		System.out.println("MENOR NUMERO: " + menor);
	}
}

