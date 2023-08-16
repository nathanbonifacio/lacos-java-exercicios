

import java.util.Scanner;
public class QuarentaETres {
	
	public static void main (String[] args) {
	/*Nathan Henrique Paiva Bonifacio*/
	Scanner scanner = new Scanner(System.in);
	int valor = 0;
	int mult = 1;
	for(int num = 1; num <= 7; num++)
	{
		System.out.print("Digite o " + num + " numero: ");
		valor = scanner.nextInt();
		
		mult *= valor;
	}
		System.out.print("Multiplicacao: " + mult);
	}
}

