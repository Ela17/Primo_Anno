import java.util.Scanner;

public class MassimoInteroRicorsivo {

	public static int massimoElementoR (int n, int m) {
    	// calcolare massimo tra n e m ricorsivamente
		if (m == 0)
			return n;
		if (n == 0)
			return m;

		return massimoElementoR (n - 1, m - 1) + 1;
	}

	public static void main (String[] args) {		
    	Scanner sc = new Scanner(System.in);
		int max = 0, x;
		boolean ins = false;

		System.out.println("Inserire numeri interi positivi. 0 per terminare : ");

		do {
			x = sc.nextInt();
			if (x > 0) {
				ins = true;
				max = massimoElementoR (x, max);
			}
		} while (x > 0);	

		if(ins == true)
			System.out.println("Il max è " + max);
		else 
			System.out.println("Nessun valore valido inserito.");
	}
}
