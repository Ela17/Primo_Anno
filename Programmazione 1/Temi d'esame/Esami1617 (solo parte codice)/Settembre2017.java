public class Settembre2017 {
		/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali di nome a e b. Entrambi sono riferimenti (puntatori, reference) 
	 * 	a matrici di interi. Si assuma che il numero di righe in a sia identico a quello di b e che
	 *      il numero di colonne di a sia identico a quello di b.
	 *      Non e' detto che a e b siano matrici quadrate.
	 * --) 	ex1 restituisce true se ogni riga di b che contenga almeno un elemento e' maggiore o uguale 
	 *      alla corrispondente riga di a.
	 *      Per definizione, una riga di b e' maggiore o uguale alla corrispondente riga di a 
	 *      se ogni elemento della riga in b e' maggiore o uguale al corrispondente elemento in a.
     *      In ogni altro caso il risultato e' false. 
	 * La classe SettembreTestEx1 puo' essere usata per il testing di ex1, contenendo esempi sul 
	 * funzionamento atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	
	public static boolean ex1(int[][] a, int[][] b){
		boolean ogniR = true;
		if(a == null || b == null || a.length == 0 || b.length != a.length)
			ogniR = false;
		else{
			for(int i = 0; i < b.length && ogniR; i++){
				if(b[i] != null && a[i] != null && b[i].length > 0 && a[i].length == b[i].length){
					boolean maggiore = true;
					for(int j = 0; j < a[i].length && maggiore; j++)
						if(a[i] != null && b[i] != null && b[i].length > 0 && a[i].length == b[i].length)
							maggiore = b[i][j] >= a[i][j];
					ogniR = maggiore;
					
				}
			}
		}
		return ogniR;
	}
	
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha come unico parametro formale un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a;
	  * --) ex2 non restituisce nulla, ma modifica a come segue: 
	  *     se a non e' ne' vuoto, ne' nullo, ogni elemento di posizione 
	  *     pari di a e' scambiato col successivo di posizione dispari, ammesso che 
	  *     quest'ultimo esista;
	  * --) ex2 richiama un metodo ricorsivo di nome 'scambia' che visiti l'array a dicotomicamente, 
	  *     ovvero che, ad ogni chiamata, suddivida a in due parti di lunghezza essenzialmente identica.	  
	 * La classe SettembreTestEx2 puo' essere usata per il testing di ex2, 
	 * contenendo esempi sul funzionamento atteso. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	
	public static void ex2(int[] a){
		if(a != null && a.length > 1)
			scambia(a, 0, a.length-1);
	}
	
	public static void scambia(int[] a, int l, int r){
		if(l == r){
			if(l%2 == 0 && l != a.length-1){
				int tmp = a[l];
				a[l] = a[l+1];
				a[l+1] = tmp;
			}
		}
		else{
			int m = (l+r)/2;
			scambia(a, l, m);
			scambia(a, m+1, r);
		}
	}
}
