

import java.util.Scanner;
public class Quarenta6 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int num = scanner.nextInt();
		int qttDivisores = 0;
		
		//verifica a quantidade de divisores
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0){
				qttDivisores++;
			}
		}
		//verifica se o numero digitado possui somente 2 divisores, pois o numero primo só é divisivel por 1 e por ele mesmo
		if(qttDivisores == 2)
		{
			System.out.println(num + " eh primo");
		}
		else
		{
			System.out.println(num + " nao eh primo");
		}
	}
}

