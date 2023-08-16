

import java.util.Scanner;
public class TrintaEDois {
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe uma Quantidade: ");
			int quantidade = scanner.nextInt();
			
			if(quantidade < 0)
			{
				System.out.print("Informe uma Quantidade: ");
				quantidade = scanner.nextInt();
				while(quantidade < 0){
					System.out.print("Informe uma Quantidade: ");
					quantidade = scanner.nextInt();
				}
			}
			
			if(quantidade > 0)
			{
				for(int i = 0; i <= quantidade; i++)
				{
					if(i % 2 == 0)
					{
						System.out.print(i + " ");
					}
				}
			}	
	}
}

