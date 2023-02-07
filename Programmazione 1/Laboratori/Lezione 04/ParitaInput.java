import java.util.Scanner;

public class ParitaInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, count = 0;
		boolean pari = false;
		boolean dispari = false;
		
		System.out.println("Inserire interi positivi (0 per terminare) :");
		do {
			n = input.nextInt();
			if(n != 0) {
				count++;
				if(n%2 == 0)
					pari = true;
				if(n%2 != 0)
					dispari = true;
			}
		} while (n > 0);
		
		if(pari && dispari)
			System.out.println("Ci sono sia numeri pari che dispari");
		else if(pari && !dispari)
			System.out.println("Tutti i numeri inseriti sono pari");
		else if(!pari && dispari)
			System.out.println("Tutti i numeri inseriti sono dispari");
		else if (count == 0)
			System.out.println("Non hai inserito numeri");
	}	
}