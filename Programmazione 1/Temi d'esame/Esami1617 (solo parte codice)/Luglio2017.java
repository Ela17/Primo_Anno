public class Luglio2017 {	
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali di nome a e b. Entrambi sono riferimenti (puntatori, reference) 
	 * 	    a matrici di interi. Si assuma che il numero di righe e di colonne in a e b coincidano.
	 *      Se a non contiene elementi, nemmeno b puo' contenerne;
	 * --) 	ex1 restituisce true se in a esiste almeno una colonna che sia identica ad
	 *      una colonna di b. In ogni altro caso il risultato e' false. 
	 * La classe LuglioTestEx1 può essere usata per il testing di ex1, contenendo esempi sul 
	 * funzionamento atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */

	public static boolean ex1(int[][] a, int[][] b){
		boolean esiste = false;
		if(a != null && b != null && a.length > 0 && b.length == a.length){
			if(a[0] != null && b[0] != null && a[0].length > 0 && b[0].length == a[0].length){
					for(int j = 0; j < a[0].length && !esiste; j++){
						for(int k = 0; k < b[0].length && !esiste; k++){
							boolean coincide = true;
							int r = 0;
							while(r < b.length && coincide){
								coincide = b[r][k] == a[r++][j];
							}
							esiste = coincide;
						}
					}
			}
		}
		return esiste;
	}
	
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha come unico parametro formale un riferimento (puntatore, reference) 
	  * 	ad un array di booleani di nome a;
	  * --) ex2 non restituisce nulla, ma modifica a come segue: 
	  *     se a non e' ne' vuota, ne' nulla, ogni elemento di posizione 
	  *     dispari di a e' sovrascritto dalla congiunzione tra se stesso e 
	  *     quello di posizione pari che lo precede;
	  * --) ex2 richiama un metodo ricorsivo di nome "sovrascrive" che visita l'array a dicotomicamente, 
	  *     ovvero che, ad ogni chiamata, suddivide a in due parti di lunghezza essenzialmente identica.	  
	 * La classe luglioTestEx2 puo' essere usata per il testing di ex1, contenendo esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	
	public static void ex2(boolean[] a){
		if(a != null && a.length > 0)
			sovrascrive(a, 0, a.length-1);
	}
	
	public static void sovrascrive(boolean[] a, int l, int r){
		if(l == r){
			if(l%2 == 1)
				a[l] = a[l] && a[l-1];
		}
		else{
			int m = (l+r)/2;
			sovrascrive(a, l, m);
			sovrascrive(a, m+1, r);
		}
	}
}
