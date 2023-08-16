

import java.util.Scanner;
public class Ex52 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro: ");
		int num = scanner.nextInt();
		
		int a = 1;
		int b = 0;
		int aux;
		
		while(a < num)
		{
			aux = a;
			a += b;
			b = aux;
		}
		//fim laço
		String resultado = a == num ? num + " pertence a sequencia de Fibonacci" : num + " nao pertence a sequencia de Fibonacci";
		System.out.print(resultado);
		
	}
}

