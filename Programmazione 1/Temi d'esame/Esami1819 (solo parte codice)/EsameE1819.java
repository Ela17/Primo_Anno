public class EsameE1819 {

    /**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri: un array bidimensionale di interi (matrice) m, 
	 * un array di interi a. L'ipotesi su m e' che o tutte le righe sono null, 
	 * oppure tutte hanno la stessa lunghezza. Quindi, m non e' detto che sia 
	 * quadrata.
	 * -) e1 restituisce true se, per ogni elemento m[i][i], esiste un elemento 
	 * di a maggiore di m[i][i]. In ogni altro caso e1 restituisce false.
	 * ATTENZIONE: m[i][j] si riferisce all'elemento di m di riga i e 
	 * colonna j; m.length si riferisce al numero di righe di m;
	 * m[i].length e' il numero di elementi della riga i.
	 * 
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
	 
	public static boolean e1(int[][] m, int[] a){
		boolean ogniElemento = true;
		
		if(m == null || m.length == 0 || a == null || a.length == 0)
			ogniElemento = false;
		else{
			for(int i = 0; i < m.length && ogniElemento; i++){
				boolean maggiore = false;
				if(m[i] != null && m[i].length > 0){
					if(m[i].length > i)
						for(int k = 0; k < a.length && !maggiore; k++)
							maggiore = a[k] > m[i][i];
					else
						maggiore = true;
				}
				ogniElemento = maggiore;
			}
		}
		return ogniElemento;
	}
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo e2 con tre parametri: un array di interi a, 
	 * un intero f, un intero d. Il metodo e2 deve restituire false se d e' 
	 * divisore intero di almeno un elemento di a il cui indice sia nell'intervallo 
	 * 0 incluso ed f escluso. In ogni altro caso, e2 deve restituire true.
	 * Il metodo e2 svolge il proprio compito richiamando e2R, metodo ricorsivo 
	 * contro-variante (l'indice di e2R che guida la ricorsione aumenta).
	 *   
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
	 
	public static boolean e2(int[] a, int f, int d){
		boolean ris = true;
		if(a != null && a.length > 0 && f >= 0 && d > 0)
			ris = e2R(a, 0, f, d);
		return ris;
	}

	public static boolean e2R(int[] a, int i, int f, int d){
		if(i == f)
			return true;
		else{
			return !(a[i] % d == 0) && e2R(a, i+1, f, d);
		}
	}
}