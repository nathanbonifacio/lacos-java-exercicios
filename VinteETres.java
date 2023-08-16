

import java.util.Scanner;
public class VinteETres {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double salario = 0;
		int filhos = 0;
		double media = 0;
		double mediaFilhos = 0;
		double percentual = 0;
		double maiorSalario = Double.MIN_VALUE;
		double soma = 0;
		int quantidade = 0;
		while(salario >= 0)
		{
			System.out.print("Informe a Quantidade de Habitantes: ");
			int habitantes = scanner.nextInt();
			
			for(int i = 1; i <= habitantes; i++){
				System.out.print("Informe o salario dos habitantes: ");
				salario = scanner.nextDouble();
				soma += salario;
				media = soma / habitantes;
				
				if(salario > maiorSalario)
				{
					maiorSalario = salario;
				}
				
				if(salario < 150)
				{
					quantidade++;
					percentual = quantidade * 100;
				}
			}
			
			for(int i = 1; i <= habitantes; i++){
				System.out.print("Informe numero de filhos dos habitantes: ");
				filhos = scanner.nextInt();
				soma += filhos;
				mediaFilhos = soma / filhos;
			}
		}
		
		System.out.println();
		System.out.println("Media de salario dos habitantes: " + media);
		System.out.println("Media do numero de filhos: " + mediaFilhos);
		System.out.println("Maior salario dos habitantes: " + maiorSalario);
		System.out.println("Percentual de pessoas com salario menor que R$ 150,00: " + percentual + "%");
	}
}

