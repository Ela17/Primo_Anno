public class Giugno0 {
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali di nome a e b. Entrambi sono riferimenti (puntatori, reference) 
	 * 	    a matrici di interi. Si assuma che le dimensioni di a e b siano  identiche.
	 *      Se a non contiene elementi, nemmeno b puo' contenerne;
	 * --) 	ex1 restituisce il true se esiste in a almeno una riga identica ad una di b.
	 *      In ogni altro caso il risultato e' false. 
	 * La classe Giugno0TestEx1 puo' essere usata per il testing di ex1, contenendo esempi sul 
	 * funzionamento atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	
	public static boolean ex1(int[][] a, int[][] b){
		boolean esiste = false;
		if(a != null && b != null && a.length > 0 && a.length == b.length){
			for(int i = 0; i < a.length && !esiste; i++)
				if(a[i] != null && a[i].length > 0)
					for(int k = 0; k < b.length && !esiste; k++)
						if(b[k] != null && b[k].length == a[i].length){
							boolean uguale = true;
							for(int j = 0; j < a[i].length && uguale; j++)
								uguale = a[i][j] == b[k][j];
							esiste = uguale;
						}
					
				
			
		}
		return esiste;
	}
	
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha come unico parametro formale un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a;
	  * --) ex2 non restituisce nulla, ma modifica a come segue: 
	  *     se a non e' ne' vuota, ne' nulla, ogni elemento di posizione 
	  *     pari di a e' sovrascritto da quello di posizione dispari che, eventualmente, lo segue;
	  * --) ex2 richiama un metodo ricorsivo di nome "sovrascrive" che visita l'array a dicotomicamente, 
	  *     ovvero che, ad ogni chiamata, suddivide a in due parti di lunghezza essenzialmente identica.	  
	 * La classe Giugno0TestEx2 puo' essere usata per il testing di ex1, contenendo esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	
	public static void ex2(int[] a){
		if(a != null && a.length > 1)
			sovrascrive(a, 0, a.length-1);
	}
	
	public static void sovrascrive(int[] a, int l, int r){
		if(l == r){
			if(l%2 == 0 && l != a.length-1)
				a[l] = a[l+1];
		}
		else{
			int m = (l+r)/2;
			sovrascrive(a, l, m);
			sovrascrive(a, m+1, r);
		}
	}
}
