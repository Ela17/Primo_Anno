
public class Esame {

	/**
	 * ESERCIZIO 1
	 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche:
	 * a) exUno ha due parametri formali con nome a e b, rispettivamente,
	 *    entrambi di tipo (reference ad) array di interi;
	 * b) exUno restituisce true se e solo se, per ogni i,
	 *    a[i] e' multiplo di almeno due elementi di b le cui posizioni
	 *    siano nell'intervallo di indici da i incluso sino al termine di b;
	 * Quindi exUno restituisce false nel caso la condizione descritta non
	 * valga anche solo per un elemento di a.
	 * Si osservi che i parametri attuali possono avere lunghezze differenti,
	 * o possono non esistere. In qualsiasi caso, exUno non deve generare alcun
	 * tipo d'errore.
	 *
	 * Il metodo exUno va scritto immediatamente al di fuori di questo commento.
	 * L'aggiunta del metodo exUno deve mantenere compilabile la classe.
	 */
	
	public static boolean exUno(int[] a, int[] b) {
		if(a == null || b == null || a.length == 0 || b.length == 0)
			return false;
		boolean ogni = true;
		for(int i = 0; i < a.length; i++){
			int cnt = 0;
			boolean multiplo = false;
			for(int j = i; j < b.length && cnt < 2; j++){
				multiplo = (a[i]%b[i] == 0);
				if(multiplo)
					cnt++;
			}
			ogni = (cnt >= 2);
		}
		return ogni;
	}

	/*************************************************************************************************/
	/** Metodi privati che DEVONO ESSERE USATI dalla soluzione all'ESERCIZIO 2. */
	  private static boolean testUno(int x) {
	     return x >= -1;
	  }
	  private static boolean testDue(int x) {
	     return x <= 1;
	  }
	/**
	 * ESERCIZIO 2
	 * Scrivere un metodo exDue che, richiamando un metodo ricorsivo exDueRic,
	 * rispetti i requisiti riportati.
	 * a) exDue DEVE avere un singolo parametro formale di nome a e di tipo
	 * reference ad un array di interi;
	 * b) exDue restituisce il valore intero ottenuto dal metodo ricorsivo
	 * exDueRic applicato ad a, se a esiste. Se a non esiste, allora exDue
	 * restituisce 0.
	 * c) exDueRic e' un metodo ricorsvio che visita a dicotomicamente e
	 * restituisce la somma di tutti gli elementi di a per i quali esattamente
	 * uno tra testUno e testDue sia vero.
	 *
	 * La chiamata a exDue non deve generare alcun tipo d'errore.
	 *
	 * Il metodo exDue va scritto immediatamente al di fuori di questo commento.
	 * L'aggiunta del metodo exDue deve mantenere compilabile la classe.
	 */
	
	public static int exDue(int[] a){
		if(a == null || a.legth == 0)
			return 0;
		return exDueRic(a, 0, a.length-1);
	}
	
	public static int exDueRic(int[] a, int l, int r){
		if(l == r){
			if(testUno(a[l]) || testDue(a[l]) && !(testUno(a[l]) && testDue(a[l])))
				return a[l];
			else
				return 0;
		}
		else{
			int m = (l+r)/2;
			return exDueRic(a, l, m) + exDueRic(a, m+1, r);
		}
	}
	
	 /**
	   * ESERCIZIO 3
	   * Sia n>=0. Dato il metodo exTre,
	   * dimostrare per induzione su n che esso soddisfa il predicato:
       *     P(n) <==> (n pari && exTre(n) == 1) || (n dispari && exTre(n) == 2)
	   * in accordo con i seguenti punti:
	   * 1) formulare esplicitamente e con precisione la base
	   * 2) formulare esplicitamente e con precisione il passo induttivo
	   * 3) dimostrare che il predicato al punto 1 è vero
	   * 4) dimostrare che il predicato al punto 2 è vero
	   */

	    public static int exTre(int n) {
	        if (n == 0)
	            return 1;
	        else
	            return 2/exTre(n - 1);
	    }

	   /**
	    * ESERCIZIO 4
	    *
	    * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	    * ovvero giusto prima della disallocazione del frame relativo ad x, quando
	    * il valore di j nel main e' pari ad 1.
	    */
	    public static void x(int l, boolean[][] a) {
			boolean[] b = new boolean[l];
			int i;
			for (i = l - 1 ; i >= 0 ; i--)
				b[i] = !(l % 2 == 0);
			a[l - 1] = b;
			// (B)
	    }

	   /******************************************/
	    public static void main(String[] args) {
			boolean[][] a = new boolean[2][];
			int j;
			for (j = 0; j < a.length ; j++)
			  x(j + 1, a); // usare (A) come indirizzo di rientro
		}
}
