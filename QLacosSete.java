

import java.util.Scanner;
public class QLacosSete {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um valor entre 1 e 10: ");
		int num = scanner.nextInt();
		
		if(num >= 1 && num <= 10)
		{
			for(int i = 1; i <= 10; i++)
			{
				int mult = num * i;
				System.out.println(num + " x " + i + " = " + mult);
			}	
		}
		else
		{
			System.out.println("ERRO");
		}	
	}
}

