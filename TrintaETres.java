

import java.util.Scanner;
public class TrintaETres {
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe uma Quantidade: ");
		int quantidade = scanner.nextInt();
		
		boolean repTimes = true;
		int num = 0;
		int cont = 0;
		
		while(repTimes == true)
		{
			if(quantidade == 0)
			{
				repTimes = false;
				System.out.println("Fim do programa");
			}
			
			if(quantidade < 0)
			{
				System.out.print("Informe uma Quantidade: ");
				quantidade = scanner.nextInt();	
			}
			
			if(quantidade > 0)
			{
				num++;
				if(num % 2 == 1){
					System.out.print(num + " ");
				}
				cont++;
				
				if(cont == quantidade){
					repTimes = false;
				}
			}
		}
		//end of looping
	}
}

