


public class VinteNove {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + ", ");
			
			//parte dos numeros pares
			if(i % 2 ==0)
			{
			  for(int num =1; num <= 10; num++){
				if(num % 2 == 0){
					System.out.print(num + " ");
				}
			  }
			}
			//fim da parte dos numeros pares
			
			//parte dos numeros impares
			if(i % 2 != 0)
			{
				for(int num = 1; num <= 10; num++){
					if(num % 2 != 0){
					System.out.print(num + " ");
					}
				}
			}
			//fim da parte dos numeros impares
			System.out.println();
		}
	}
}

