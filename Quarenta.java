

import java.util.Scanner;
public class Quarenta {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Provide an exact amount: ");
		int amount = scanner.nextInt();
		
		boolean repTimes = true;
		int cont = 0;
		int num1 = 1;
		//int num2 = 10;
		
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
			System.out.print(num1 + " ");				
			cont++;

			if(cont < (amount/2)){
				num1++;
			}else if(cont == (amount/2)){
			}else{
				num1--;
			}
				
			if(cont == amount){
				repTimes = false;
			}
			
			}
		}
		//end of loop
	}
}

