

import java.util.Scanner;
public class Quinze {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		System.out.print("Digite o primeiro numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = scanner.nextInt();
		System.out.println();
		
		if(n1 > n2)
		{
			for(int i = n2; i <= n1; i++){
				soma += i;
			}
			System.out.println(soma);
		}
		else
		{
			for(int i = n1; i <= n2; i++){
				soma += i;
			}
			System.out.println(soma);
		}
		
	}
}

