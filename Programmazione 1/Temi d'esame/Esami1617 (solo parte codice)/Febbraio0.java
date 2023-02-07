public class Febbraio0 {
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	 * 	    ad un array di interi di nome a; il secondo e' un riferimento ad un array di interi di nome b,
	 * --) 	se a e b contengono ciascuno almeno un elemento,
	 *      ex1 restituisce il valore true se in a esiste un elemento a[i] tale che
	 * 	    ogni elemento nel segmento b[i...b.length-1] sia strettamente piu' piccolo di a[i].
	 *      Altrimenti il risultato e' false. 
	 * La classe Febbraio0TestEx1 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	
	public static boolean ex1(int[] a, int[] b){
		boolean esiste = false;
		if(a != null && b != null && a.length > 0 && b.length > 0){
			for(int i = 0; i < a.length && !esiste; i++){
				boolean minore = true;
				for(int j = i; j < b.length && minore; j++)
					minore = b[j] < a[i];
				esiste = minore;
			}
		}
		return esiste;
	}
	
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a; il secondo e' un intero k.
	  * --) ex2 restituisce true se k occorre in tutte le posizioni pari di a. 
	  *     Altrimenti il risultato e' false.
	  * --) ex2 richiama un metodo ricorsivo di nome occorreInPosPari, che visita l'array a dicotomicamente, 
	  *     ovvero suddivide a, ad ogni chiamata, in due parti di lunghezza essenzialmente identica.	  
	 * La classe Febbraio0TestEx2 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	
	public static boolean ex2(int[] a, int k){
		boolean b = false;
		if(a != null && a.length > 0)
			b = occorreInPosPari(a, k, 0, a.length-1);
		return b;
	}
	
	public static boolean occorreInPosPari(int[] a, int k, int l, int r){
		if(l == r){
			if(l%2 == 0)
				return (a[l] == k);
			return true;
		}
		else{
			int m = (l+r)/2;
			return occorreInPosPari(a, k, l, m) && occorreInPosPari(a, k, m+1, r);
		}
	}
}
