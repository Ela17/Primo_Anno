import java.util.Scanner;

public class Quadrato {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N, j;
		
		System.out.print("Inserire un intero positivo: ");
		N = input.nextInt();
		
		for(int i = 1; i <= N; i++){
			
			for(j = 0; j < i-1; j++)
				System.out.print("*");
			
			System.out.print("\\");
			
			for(j = 0; j <= N-i-1; j++)
				System.out.print(":");
				
			System.out.println();
		}
	}	
}