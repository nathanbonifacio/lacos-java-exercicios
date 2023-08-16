

import java.util.Scanner;
public class Ex54 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero inicial inteiro: ");
		int num1 = scanner.nextInt();
		System.out.print("Informe um numero final inteiro: ");
		int num2 = scanner.nextInt();
		
		int a = 1;
		int b = 0;
		int aux;
		
		while(a <= num2)
		{
			aux = a;
			a += b;
			b = aux;
			
			if(a >= num1 && num2 <= a)
			{
				System.out.print(a + " ");
			}
		}
		//fim
		
	}
}

