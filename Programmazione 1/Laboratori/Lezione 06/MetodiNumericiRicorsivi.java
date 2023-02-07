import java.util.Scanner;

public class MetodiNumericiRicorsivi {
	// 	metodo che calcola ricorsivamente b^e, assumendo che e>=0
	public static int esponenziale (int b, int e) {
		
		if(e <= 0)
			return 1;
		else 
			return b * esponenziale (b, e - 1);
		
	}
	
	/* 	metodo che calcola ricorsivamente a+b, assumendo che a,b>0
		si usino solo incrementi o decrementi unitari */
	public static int somma (int a, int b) {
		
		if(b == 0)
			return a;
		else 
			return somma (a + 1, b - 1);
		
	}
	
	/* 	n,m,q>0 . Calcola ricorsivamente il prodotto di tutti gli
		interi compresi tra n e m che siano multipli di q */
	public static int prodottoMultipli (int n, int m, int q) {
		if(n > m)
			return 1;
		else {
			if(n % q == 0) 
				return n * prodottoMultipli(n + 1, m, q);
			else 
				return prodottoMultipli(n + 1, m, q);
			
		}
	}
	
	//	metodo che stampa ricorsivamente i valori da n a 0 
	public static void stampaInteroAlRovescio (int n) {
		if (n < 0)
			return;
		else {
			System.out.print(n + " ");
			stampaInteroAlRovescio(n - 1);
		}
	}
	
	
	public static void main (String[] args) {
		//test esponenziale
		System.out.println("3^2 con metodo: " + esponenziale(3,2)); // atteso 9
		
		//test somma
		System.out.println("3+2 con metodo: " + somma(3,2)); // atteso 5
		System.out.println("4+5 con metodo: " + somma(4,5)); // atteso 5
		
		//test prodotto
		System.out.println("3*6 con metodo: " + prodottoMultipli(1,7,3)); // atteso 18
		
		//test stampa
		stampaInteroAlRovescio(10);	// atteso 10 9 8 7 6 5 4 3 2 1 0
	}
	
}