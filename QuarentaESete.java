

public class QuarentaESete {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		
		for(int num = 2; num <= 50; num++)
		{
			boolean primo = true;
			for(int divisor = 2; divisor < num; divisor++)
			{
				if(num % divisor == 0){
					primo = false;
					break;
				}
			}
			if(primo)
			{
				System.out.print(num + " ");
			}
		}
		//fim do looping
	}
}

