

import java.util.Scanner;
public class QLacosDez {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int qtt = 10;
		int soma = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Informe um valor: ");
			num = scanner.nextInt();
			
			soma = num+=num;		
		}
		double media = (double)soma / qtt;
		System.out.println(media);
	}
}

