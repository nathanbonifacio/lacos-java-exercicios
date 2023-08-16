

import java.util.Scanner;
public class QuarentaEUm {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("provide an amount: ");
		int amount = scanner.nextInt();
		
		int mult = 1;
		
		for(int num = amount; num >= 1; num--)
		{
			mult*=num;
			System.out.print(num + " " + " x");
					
		}
		System.out.print(" = " + mult);		
	}
}

