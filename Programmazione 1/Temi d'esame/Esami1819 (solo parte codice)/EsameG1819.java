public class EsameG1819 {

	/** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente). 
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri, entrambi di tipo array di interi, di nome 
	 * a e b, rispettivamente; 
	 * -) e1 restituisce true se esistono almeno due elementi di a 
	 * inferiori ad ogni elemento di posizione dispari in b. 
	 * In ogni altro caso, e1 restituisce false. 
	 * SCRIVERE la soluzione immediatamente qui sotto.                */
	 
	public static boolean e1(int[] a, int[] b){
		boolean  esiste = false;
		
		if(a != null && b != null && a.length > 1 && b.length > 0){
			int cnt = 0;
			for(int i = 0; i < a.length && !esiste; i++){
				boolean minore = true;
				for(int j = 1; j < b.length && minore; j += 2){	// salto di 2 per controllare solo j dispari
					minore = a[i] < b[j];
				}
				if (minore)
					cnt++;
				if(cnt==2)
					esiste = true;
			}
		}
		
		return esiste;
	}

	/** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) e2 tale che:
     * -) e2 ha come unico parametro formale un array di interi a;
     * -) e2 restituisce un array di interi, richiamando un metodo 
     * ricorsivo dicotomico e2R che si comporta come segue:
     * -) e2R prende quattro parametri:
     * --) il primo parametro e' l'array a;
     * --) il secondo parametro e' un array b, passatogli da e2, che
     * conterra' il risulato;
     * --) il terzo ed il quarto parametro sono gli indici che individuano 
     * l'intervallo di lavoro sull'array a; 
     * -) e2R scrive nell'array b ogni elemento di a, 
     * incrementato di una unita' se l'elemento ha posizione pari, 
     * decrementato di una unita' se l'elemento ha posizione dispari.
	 * Scrivere la soluzione immediatamente qui sotto.                */
	 
	public static int[] e2(int[] a){
		if(a == null)
			return null;
		int[] b = new int[a.length];
		if(a.length > 0)
			e2R(a, b, 0, a.length-1);	
		return b;
	}
	
	public static void e2R(int[] a, int[] b, int l, int r){
		if(l == r){
			if(l%2 == 0)
				b[l] = a[l] + 1;
			else
				b[l] = a[l] - 1;
		}
		else{
			int m = (l+r)/2;
			e2R(a, b, l, m);
			e2R(a, b, m+1, r);
		}
	}
}