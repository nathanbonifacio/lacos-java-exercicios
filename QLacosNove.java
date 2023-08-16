

import java.util.Scanner;
public class QLacosNove {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int qtt = 0;
		int qttIntervalo = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Informe um numero: ");
			num = scanner.nextInt();
			
			if(num >= 10 && num <= 20){
				qttIntervalo++;
			}
			
			if(num < 10 || num > 20){
				qtt++;
			}
		}
		System.out.println();
		System.out.println("Numeros entre o intervalo de 10 e 20 (inclusos): " + qttIntervalo);
		System.out.println("Numeros restantes: " + qtt);
	}
}

