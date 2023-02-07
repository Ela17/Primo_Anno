import java.util.Scanner;

public class Freccia {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int N, j, i;
		
		System.out.print("Inserire un intero positivo: ");
		N = input.nextInt();
		
		for (i = 1; i <= N; i++) {
			for (j = 0; j < i - 1; j++)
				System.out.print(".");
			System.out.println("**");
		}	
		
		for (i = N - 1; i >= 1; i--) {
			for (j = i - 1; j > 0; j--)
				System.out.print(".");
			System.out.println("**");
		}	
	}
		
}