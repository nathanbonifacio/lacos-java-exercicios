

import java.util.Scanner;
public class TrintaESete {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de termos: ");
		int qtt = scanner.nextInt();
		
		boolean vezes = true;
		int cont = 0;
		int divisor = 1;
		int num = 0;
		int num2 = 1;
		while(vezes == true)
		{
			if(qtt == 0)
			{
				vezes = false;
				System.out.println("Fim do programa");
			}
			
			if(qtt < 0)
			{
				System.out.print("Informe a quantidade de termos (maior que zero!): ");
				qtt = scanner.nextInt();
			}
			
			if(qtt > 0)
			{
				if(divisor == 1){
					System.out.print(num2 + " ");
				}
				else{
					System.out.print(num + "/" + divisor + " ");
				}
				
				cont++;
				divisor++;
				num++;
				
				if(cont == qtt){
					vezes = false;
				}
			}
		}
	}
}

