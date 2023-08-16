

import java.util.Scanner;
public class TrintaESeis {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("provide an exact amount: ");
		int amount = scanner.nextInt();
		
		boolean repeat = true;
		int num = 1;
		int diviser = 1;
		int cont = 0;
		
		while(repeat == true)
		{
			if(amount < 0){
				System.out.print("provide an exact amount: ");
				amount = scanner.nextInt();
			}
			
			if(amount == 0){
				repeat = false;
				System.out.print("Program's final");
			}
			
			if(amount > 0){
				//int num = 1;
				if(diviser == 1)
				{
					System.out.print(num + " ");
				}
				else
				{
					System.out.print(num + "/" + diviser + " ");
				}
				diviser++;
				cont++;
				
				if(cont == amount)
				{
					repeat = false;
				}
				
				/*int numb = 1;
				if(amount == 1)
				{
					System.out.print(numb + " ");
				}
				else
				{
					System.out.print(numb + "/" + diviser + " ");
				}
				
				diviser++;
				cont++;
			
				if(cont == amount)
				{
					repeat = false;
				}*/
			}
			
			
		}
		
	}
}

