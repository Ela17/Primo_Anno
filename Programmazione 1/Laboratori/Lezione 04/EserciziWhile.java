import java.util.Scanner;


public class EserciziWhile{

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un intero positivo > ");
		int n = input.nextInt();
		int i; 
		
		//stampa da 0 a n
		for (i = 0; i <= n; i++)
			System.out.println(i);
		
		System.out.println();
		
		//stampa da n a 0
		while ( i>=0 ) 
			System.out.println(i--);
		
		System.out.println();
		
		//stampa interi dispari da 0 a n		
		for (i = 0; i <= n; i++) 
			if( i%2 != 0)
				System.out.println(i);
		
		System.out.println();
		
		//stampa fattoriale di n
		int fact = 1;
		//utilizzo for
		for (i = 1; i <= n; i++)
				fact = fact*i;
		System.out.println(n + "! = " + fact);
		
		System.out.println();
		
		fact = 1;
		//utilizzo while
		i = 1;
		while (i <= n) {
			fact = fact*i;
			i++;
		}
		System.out.println(n + "! = " + fact);
	}
}