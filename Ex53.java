


public class Ex53 {
	
	public static void main (String[] args) {
		/*Nathan Henrique Paiva Bonifacio*/
		
		int a = 1;
		int b = 0;
		int aux;
		
		for(int i = 0; i <= 15; i++)
		{
			System.out.print(a + " ");
			aux = a;
			a += b;
			b = aux;
			
		}
		//fim do laço
	}
}

