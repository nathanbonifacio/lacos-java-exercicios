


public class Trinta {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + ", ");	
			
				if(i % 2 == 0){
				for(int num = 1; num <= i * 2 ; num++){
					if(num % 2 == 0){
						System.out.print(num + " ");
					}
				}
			}		
			
			if(i % 2 != 0){
				for(int num = 1; num < i * 2; num++){
					if(num % 2 != 0){
						System.out.print(num + " ");
					}
				}
			}
			System.out.println();
		}
	}
}


