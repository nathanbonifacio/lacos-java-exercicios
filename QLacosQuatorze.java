

import java.util.Scanner;
public class QLacosQuatorze {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		System.out.print("Digite o primeiro numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = scanner.nextInt();
		System.out.println();
		
		if(n1 > n2){
			System.out.println("N2 TEM QUE SER MAIOR DO QUE N1");
		}
		else{
			while(n1 <= n2)
			{
				soma += n1;
				n1++;
			}
			System.out.println(soma);
		}
	}
}

