

import java.util.Scanner;
public class QLacosOnze {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		double nota;
		
		System.out.print("Informe a quantidade de alunos(as): ");
		int qttAlunos = scanner.nextInt();
		double somaNota = 0;
		System.out.println();
		
		for(int i = 1; i <= qttAlunos; i++)
		{
			System.out.print("Informe a nota do " + i + "º aluno(a): ");
			nota = scanner.nextDouble();
			somaNota += nota;
		}
		System.out.println();
		double media = somaNota/qttAlunos;
		System.out.println("Media Aritmetica: " + media);
	}
}

