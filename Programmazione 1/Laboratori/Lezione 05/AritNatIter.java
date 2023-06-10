public class AritNatIter {
    // metodo che implementa la somma di due numeri x e y, 
    // attraverso incrementi progressivi di +1. 
    // L'argomento y non può essere negativo.
    public static int somma (int x, int y) { // x, y parametri formali
        int s = x;
        int i = 0;
        while (i < y) {
            s = s + 1;
            i = i + 1;
        }
        return s;
    }

    // il metodo moltiplicazione restituisce il prodotto tra x ed y.
    // Il prodotto viene realizzato attraverso incrementi successivi di +1.
    public static int moltiplicazione (int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
        while (i < y) {
            m = somma(m, x); // chiamiamo somma sui parametri attuali m e x
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }
	
	// il metodo max ritorna il massimo tra x e y
	public static int max (int x, int y) {
		if (x <= y)
			return y;
		return x;
	}	
	
	// il metodo sommatoria ritorna la sommatoria 1+2+3+...+n
	public static int sommatoria (int n) {
		int s = 0;
		for(int i = 1; i <= n; i++)
			s = somma(s, i);
		return s;
	}	
	
	// il metodo fattoriale restituisce il fattoriale di n
	public static int fattoriale (int n) {
		int s = 1;
		for(int i = n; i >= 1; i--)
			s = moltiplicazione(i, s);
		return s;
	}	
	
	// il metodo potenza calcola x elevato a y usando il medodo moltiplicazione
	public static int potenza (int x, int y) {
		int p = 1;
		for (int i = 1; i <= y; i++)
			p = moltiplicazione(p, x);
		return p;
	}	

    public static void main (String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)
		System.out.println(somma(somma(12,3),5) == somma(12, somma(3,5)));

        // Test metodo moltiplicazione 
        System.out.println("523 * 13 = " + moltiplicazione(523, 13) 
            + ", atteso: " + (523*13));
        System.out.println("523 * 0 = " + moltiplicazione(523, 0) 
            + ", atteso: " + (523*0));

        // Test commutatività moltiplicazione 
        System.out.println(moltiplicazione(523, 13) == moltiplicazione(13, 523));
        System.out.println(moltiplicazione(523, 0) == moltiplicazione(0, 523));
        System.out.println(moltiplicazione(0, 13) == moltiplicazione(13, 0));

        // ESERCIZIO: verificare associatività moltiplicazione con alcuni esempi di test
        //            (x*y)*z == x*(y*z)
		System.out.println(somma(somma(2,3),5) == somma(2, somma(3,5)));
		
		// Test sul max
		System.out.println("max(33, 3) = " + max(33, 3) + ", atteso: " + 33);
		
		// Test sulla sommatoria
		System.out.println("sommatoria di 5 = " + sommatoria(5) + ", atteso: " + (5+4+3+2+1));
		
		// Test sul fattoriale
		System.out.println("fattoriale di 5 = " + fattoriale(5) + ", atteso: " + (5*4*3*2));
		
		// Test sulla potenza
		System.out.println("5 alla terza = " + potenza(5, 3) + ", atteso: " + (5*5*5));
    }
}
