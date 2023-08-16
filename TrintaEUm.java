

import java.util.Scanner;
public class TrintaEUm {
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
				for(int i = 1; i <= quantidade; i++)
				{
					System.out.print(i + " ");
				}
			}	
	}
}

