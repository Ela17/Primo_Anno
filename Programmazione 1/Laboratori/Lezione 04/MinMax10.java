import java.util.Scanner;

public class MinMax10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for( int i = 0; i < 10; i++) {
			System.out.print("Inserire un intero: ");
			n = input.nextInt();
			if(n <= min)
				min = n;
			if(n >= max)
				max = n;
		}
			
		System.out.println("Differenza tra massimo e minimo valore: " + (max-min));

	}	
}