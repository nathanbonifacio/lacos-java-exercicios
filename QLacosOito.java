

import java.util.Scanner;
public class QLacosOito {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/	
		Scanner scanner = new Scanner(System.in);
		
		int qttNegativos = 0;
		int num;
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Informe um numero: ");
			num = scanner.nextInt();
			
			if(num < 0){
				qttNegativos++;
			}		
		}
		System.out.println();
		System.out.print("Quantidade de negativos: " + qttNegativos);
	}
}

