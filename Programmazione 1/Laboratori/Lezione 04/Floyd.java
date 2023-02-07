import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		int n = 1;
		
		System.out.print("Inserire un intero positivo: ");
		N = input.nextInt();
		
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(n + "\t");
				n++;
			}
			System.out.println();
		}
		
	}	
}