import java.util.Scanner;

public class QuarentaEOito {
    public static void main(String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequencia de numeros primo: ");
        int num = scanner.nextInt();

		int i = 2;
		int qttPrimos = 0;
		
		while(qttPrimos < num)
		{
			boolean primo = true;
			for(int divisor = 2; divisor < i; divisor++)
			{
				if(i % divisor == 0){
					primo = false;
					break;
				}
			}
			
			if(primo)
			{
				qttPrimos++;
				if(qttPrimos == num)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i + ", ");
				}
			}
			i++;
		}
		//fim do looping
    }
}
