public class EsameA1819 {

    /** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * 
     * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
     * -) e1 ha un singolo parametro, di tipo array bidimensionale (matrice) di interi; 
     * -) e1 restituisce true se nella matrice esiste almeno una riga di indice i 
     * in cui ogni elemento a partire dalla colonna i inclusa e' maggiore 
     * del precedente, ammesso che il precedente esista. In ogni altro 
     * caso il risultato deve essere false.
     * ATTENZIONE: Ricordate che m[i][j] si riferisce all'elemento di m 
     * di riga i e colonna j, m.length si riferisce al numero di righe di m,
     * m[i].length e' il numero di elementi della riga i.
     * SCRIVERE la soluzione immediatamente qui sotto.                */

    public static boolean e1(int[][] m){
        boolean esiste = false;	// true se esiste riga i che rispetta la condizione
		
		if(m != null && m.length > 1){	// devo avere almeno 2 elementi per poter fare il confronto
			for(int i = 0; i < m.length && !esiste; i++){
				boolean maggiore = true;
				if(m[i] != null && m[i].length > 0){
					for(int j = i; j < m[i].length && maggiore; j++)
						if(!(i == 0 && j == 0))
							maggiore = (m[i][j] > m[i][j-1]);
					
					esiste = maggiore;
				}
			}
		}
		return esiste;
    }
        
    /** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
     * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
     * -) e2 ha due parametri formali: un array di interi a, un intero v;
     * -) e2 modifica a richiamando un metodo void ricorsivo
     * co-variante e2R (in cui l'indice di ricorsione diminuisce nella 
     * chiamata ricorsiva). e2R deve raddoppiare il valore in a[i] nel 
     * caso in cui (1) i e' pari e (2) a[i] e' strettamente maggiore di v.   
     * Scrivere la soluzione immediatamente qui sotto.                */

    public static void e2(int[] a, int v){
		if(a == null || a.length == 0)
			return;
		e2R(a, v, a.length-1);
    }

    public static void e2R(int[] a, int v, int i) {
		if(i >= 0) {
			if(i%2 == 0 && a[i] > v)		// se vale (1) and (2) 
				a[i] = 2*a[i];				// --> raddoppio a[i]
			// in ogni caso chiamo ricorsivamente e2R sull'elemento precedente
			e2R(a, v, i-1);
		}	
	}
}