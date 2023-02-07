import java.util.Scanner;

public class MediaInput {
	
	public static void main (String args[]) {
		int n, count = 0, sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire interi positivi (0 per terminare) :");
		do {
			n = input.nextInt();
			if(n != 0) {
				count++;
				sum = sum + n;
			}
		} while (n > 0);
		
		if(count == 0)
			System.out.println("Non hai inserito nessun valore!");
		else
			System.out.println("La media degli interi inseriti e' : media = " + (sum/count));
	}
}