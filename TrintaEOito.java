

import java.util.Scanner;
public class TrintaEOito {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Provide an exact amount: ");
		int amount = scanner.nextInt();
		
		boolean repTimes = true;
		int divider = 1;
		int num = 0;
		int cont = 0;
		
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
				if(amount == 1){
					System.out.print(num + "/" + divider + ", ");
				}
				
				if(amount > 1){
					System.out.print(num + "/" + divider + ", ");
				}
				divider++;
				cont++;
				num++;
				
				//condition to end with the loop
				if(cont == amount){
					repTimes = false;
				}
			}
		}
		//end of looping
	}
}

