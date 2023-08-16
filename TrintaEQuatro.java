

import java.util.Scanner;
public class TrintaEQuatro {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe uma Quantidade: ");
		int quantidade = scanner.nextInt();
		
		boolean repeat = true;
		int soma = 0;
		int num = 1;
		int cont = 0;
		
		while(repeat == true)
		{
			if(quantidade == 0)
			{
				repeat = false;
				System.out.println("FIM DO PROGRAMA");
			}
			
			if(quantidade < 0)
			{
				System.out.print("Informe uma Quantidade: ");
				quantidade = scanner.nextInt();
			}
			
			if(quantidade > 0)
			{
				if(quantidade == 1){
					System.out.print(cont + " ");
				}
				
				if(quantidade > 1){
					num += cont;
					System.out.print(num + " ");			
				}

				num++;
				cont++;
				if(cont == quantidade){
					repeat = false;
				}
			}
		}
		//fim do looping
			
	}
}

