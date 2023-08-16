
import java.util.Scanner;
public class Ex51{
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe quantidade de termos da sequência de Fibonacci: ");
		int qtt = scanner.nextInt();
		int a = 1;
		int b = 0;
		int aux;
		
		for(int i = 0; i <= qtt; i++)
		{
			System.out.print(a + " ");
			aux = a;
			a += b;
			b = aux;
		}
		//fim do laço
	}
}

