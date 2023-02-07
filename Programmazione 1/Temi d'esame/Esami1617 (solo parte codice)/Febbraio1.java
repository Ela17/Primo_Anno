public class Febbraio1 {
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	 * 	    ad un array di interi di nome a; il secondo e' un riferimento ad un array di interi di nome b,
	 * --) 	ex1 restituisce il valore true se ogni elemento a[i] di a e' tale che
	 * 	    qualche elemento in b[i...b.length-1] sia piu' piccolo di a[i] a patto che a e b contengano
	 *      almeno un elemento.
	 *      In ogni altro frangente, il risultato deve essere false. 
	 * La classe Febbraio1TestEx1 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex1. 
	 * DOVE SCRIVERE ex1: immediatamente al di sotto di questo commento.  
	 */
	
	public static boolean ex1(int[] a, int[] b){
		boolean ogniElem = true;
		if(a == null || b == null || a.length < 1 || b.length < 1)
			ogniElem = false;
		else{
			for(int i = 0; i < a.length && ogniElem; i++){
				boolean minore = false;
				for(int j = i; j < b.length && !minore; j++)
					minore = b[j] < a[i];
				ogniElem = minore;
			}
		}
		return ogniElem;
	}
	
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a; il secondo e' un intero k.
	  * --) ex2 restituisce true se k occorre in qualche posizione di indice pari di a. Altrimenti il risultato e' false.
	  * --) ex2 richiama un metodo ricorsivo di nome occorreInPosPari, che visita l'array a dicotomicamente, ovvero suddivide a, 
	  *     ad ogni chiamata, in due parti di lunghezza essenzialmente identica.	  
	 * La classe Febbraio1TestEx2 può essere usata per il testing di ex2 e, quindi, contiene esempi sul funzionamento 
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
			return false;
		}
		else{
			int m = (l+r)/2;
			return occorreInPosPari(a, k, l, m) || occorreInPosPari(a, k, m+1, r);
		}
	}
}
