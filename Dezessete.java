

import java.util.Scanner;
public class Dezessete {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		double media = 0;
		int qtt = 2;
		double soma = 0;
		
		System.out.print("Informe a nota da primeira prova: ");
		double n1 = scanner.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		double n2 = scanner.nextDouble();
		
		if(n1 < 0 | n1 > 10 || n2 < 0 | n2 > 10)
		{
			System.out.println("NOTA(S) INVALIDAS");
		}
		else
		{
			soma = n1 + n2;
			media = soma / qtt;
			System.out.println("MEDIA: " + media);
		}
		System.out.println();
		
		System.out.println("NOVO CALCULO (S/N)");
		char op = scanner.next().charAt(0);
		
		switch (op)
		{
			case 'S':
				System.out.print("Informe a nota da primeira prova: ");
				n1 = scanner.nextDouble();
				System.out.print("Informe a nota da segunda prova: ");
				n2 = scanner.nextDouble();
				if(n1 < 0 | n1 > 10 || n2 < 0 | n2 > 10){
					System.out.println("NOTA(S) INVALIDAS");
				}
				else{
					soma = n1 + n2;
					media = soma / qtt;
					System.out.println("MEDIA: " + media);
				}
				System.out.println();
				
				System.out.println("NOVO CALCULO (S/N)");
				op = scanner.next().charAt(0);
				
				while(op == 'S' || op == 's'){
					System.out.print("Informe a nota da primeira prova: ");
					n1 = scanner.nextDouble();
					System.out.print("Informe a nota da segunda prova: ");
					n2 = scanner.nextDouble();
					if(n1 < 0 | n1 > 10 || n2 < 0 | n2 > 10){
						System.out.println("NOTA(S) INVALIDAS");
					}
					else{
						soma = n1 + n2;
						media = soma / qtt;
						System.out.println("MEDIA: " + media);
					}
					System.out.println();
					
					System.out.println("NOVO CALCULO (S/N)");
					op = scanner.next().charAt(0);
					}
					
				break;
				
			case 'N':
				break;
		}
		

	}
}

