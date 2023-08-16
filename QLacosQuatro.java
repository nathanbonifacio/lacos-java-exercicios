import java.util.Scanner;
public class QLacosQuatro {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scanner.nextInt();
			
		if(num <= 0)
		{
			System.out.println("Numero invalido. O valor tem que ser maior e diferente de zero");
		}
		else
		{
			for(int i = 1; i <= num; i++)
			{
				System.out.print(i + " ");
			}
		}
		
	}
}

