import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire un intero: ");
		
		int N = input.nextInt();
		int n=0, m=1;
		
		System.out.print(n + "\t" + m + "\t");
		
		for(int i=1; i <= N-2; i++) {
			m = m + n;
			n = m - n;
			System.out.print(m + "\t");
		}	
		
	}	
}