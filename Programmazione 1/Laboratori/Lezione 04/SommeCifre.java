import java.util.Scanner;

public class SommeCifre {
	
	public static int numeroCifre(int n){
		int m = 0;
		for (int i = 1; i <= n; i++)
			m = 10*m + n;
		
		return m;
	}	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire un intero compreso tra 1 e 9: ");
		
		int N = input.nextInt();
		int s = 0;
		
		if(N<1 || N>9)
			System.out.println("Inserimento non valido.");
		
		for(int i = 1; i <= N; i++)
			s = s + numeroCifre(i);
		
		System.out.println("Risultato = " + s);
	}
}