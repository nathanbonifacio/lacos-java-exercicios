

import java.util.Scanner;
public class QLacosTreze {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double num;
		double soma = 0;
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Numero: ");
			num = scanner.nextDouble();
			
			if(num < 40){
				soma = soma + num;
			}
		}
		System.out.println();
		System.out.println("Soma dos numeros inferiores a 40: " + soma);
	}
}

