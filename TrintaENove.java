

import java.util.Scanner;
public class TrintaENove {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Provide an exact amount: ");
		int amount = scanner.nextInt();
		
		boolean repTimes = true;
		int num = 1;
		double divider = amount;
		int cont = 0;
		double sum = 0;
		
		while(repTimes == true)
		{
			if(amount == 0)
			{
				repTimes = false;
				System.out.println("Program's final");
			}
			
			if(amount < 0)
			{
				System.out.print("Provide an exact amount: ");
			    amount = scanner.nextInt();	
			}
			
			if(amount > 0)
			{
				/*if(divider == 1){
					System.out.print(num + "/" + divider + ", ");
				}*/
				
				System.out.print(num + "/" + (int)divider + ", ");
				
				sum += (num/divider);
				cont++;
				divider--;
				num++;
					
				if(cont == amount){
					repTimes = false;
				}
			}
		}
		//end of loop
		System.out.println();
		System.out.print("Sum: " + sum);
	}
}

