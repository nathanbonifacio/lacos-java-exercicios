

import java.util.Scanner;
public class TrintaECinco {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("provide an exact amount: ");
		int amount = scanner.nextInt();
		//int numb1 = 1;
		//boolean repeat = true;
		
		while(amount < 0)
		{
			System.out.print("provide an exact amount: ");
			amount = scanner.nextInt();
		}
		
		for(int i = 1; i <= amount; i++)
		{
			System.out.print(i + ", " + "-" + i + " ,");
		}
		
	}
}

