public class EsameL1819 {

	/** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente). 
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri, entrambi di tipo array di interi, di nome 
	 * a e b, rispettivamente; 
	 * -) e1 restituisce true se esistono almeno due elementi di a 
	 * inferiori ad un elemento in b di posizione dispari. 
	 * In ogni altro caso, e1 restituisce false. 
	 * SCRIVERE la soluzione immediatamente qui sotto.                */
	
	public static boolean e1(int[] a, int[] b){
		boolean esistonoDue = false;
		
		if(a != null && b != null && a.length > 1 && b.length > 1){
			int cnt = 0;
			for(int i = 0; i < a.length && !esistonoDue; i++){
				boolean inferiore = false;
				for(int j = 1; j < b.length && !inferiore; j += 2)
					inferiore = a[i] < b[j];
				if(inferiore)
					cnt++;
				if(cnt >= 2)
					esistonoDue = true;
			}
		}
		
		return esistonoDue;
	}
	
	/** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) e2 tale che:
     * -) e2 ha come unico parametro formale un array di interi a;
     * -) e2 restituisce un array di interi, richiamando un metodo 
     * ricorsivo *co-variante* e2R che si comporta come segue:
     * -) e2R prende quattro parametri:
     * --) il primo parametro e' l'array a;
     * --) il secondo parametro e' un array b, passatogli da e2, che
     * verra' restituito come risultato;
     * --) il terzo parametro e' l'indice che individua 
     * l'intervallo di lavoro sull'array a;
     * --) il quarto parametro e' l'indice che individua il prossimo
     * elemento di b in cui inserire un valore. 
     * -) e2R scrive nell'array b ogni elemento dell'array a che si trovi in posizione pari. 
     * Per semplicita', l'ordine degli elementi copiati in b e' l'inverso
     * dell'ordine di apparizione in a.
     * In generale, b contiene meno elementi di quelli di a.
     * Per metodo ricorsivo *co-variante* intendiamo che il parametro 
     * che guida la ricorsione *de*cresce al *de*crescere della
     * difficolta' della porzione di problema che resta da risolvere.  
	 * Scrivere la soluzione immediatamente qui sotto.                */
	
	public static int[] e2(int[] a){
		if(a == null || a.length == 0)
			return a;
		
		int n;
		n = (a.length%2 == 0) ? (a.length/2) : (a.length/2 + 1);
		int[] b = new int[n];
		e2R(a, b, a.length - 1, 0);
		
		return b;
	}
	
	public static void e2R(int[] a, int[] b, int i, int j){
		if(i >= 0 && j <= b.length - 1){
			if(i%2 == 0){
				b[j] = a[i];
				e2R(a, b, i-2, j+1);
			}
			else 
				e2R(a, b, i-1, j);
		}
	}
}