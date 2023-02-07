import java.util.Scanner;

public class DivisoriInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire un intero positivo: ");
		int n = input.nextInt();
		
		for (int i=1; i <= n; i++)
			if(n%i == 0)
				System.out.println(i);
		
	}	
}