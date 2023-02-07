public class EsameB1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche: 
	 * -) e1 ha un singolo parametro, di tipo array bidimensionale (matrice) di interi. 
	 * -) e1 restituisce true se nella matrice esiste almeno una riga di 
	 * indice i in cui ogni elemento dalla colonna 0 alla colonna
     * i inclusa e' strettamente minore del successivo, ammesso che il
	 * successivo esista. In ogni altro caso il risultato deve essere false.
	 * ATTENZIONE: Ricordate che m[i][j] si riferisce all'elemento di m 
	 * di riga i e colonna j, m.length si riferisce al numero di righe di m,
	 * m[i].length e' il numero di elementi della riga i
	 * SCRIVERE la soluzione immediatamente qui sotto.
	 */
	
	public static boolean e1(int[][] m) {
		boolean minore, esiste = false;
		
		if(m != null && m.length != 0) {
			for(int i = 0; i < m.length && !esiste; i++) {
				minore = true;
				if(m[i] != null) {
					for(int j = 0; j <= i && minore; j++){
						if(j == m[i].length - 1)
							minore = false;
						else
							minore = (m[i][j] < m[i][j+1]);
					}
					esiste = true && minore;
				}	
			}
		}
		
		return esiste;
	}
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha due parametri: un array di interi a, un intero u;
	 * -) e2 modifica l'array a richiamando un metodo void ricorsivo 
	 * controvariante e2R (l'indice aggiuntivo in e2R aumenta nella 
	 * chiamata ricorsiva). e2R deve raddoppiare il valore in a[i] nel 
	 * caso in cui
	 * -) a[i] e' strettamente minore di v e 
	 * -) a[i] e' dispari.
	 * Scrivere la soluzione immediatamente qui sotto.                */
	
	public static void e2(int[] a, int u) {
		if(a != null && a.length != 0)
			e2R(a, u, 0);
	}
	
	public static void e2R(int[] a, int u, int i) {
		if(i < a.length) {
			if(a[i] < u && a[i]%2 == 1){
				a[i] = 2 * a[i];
			}
			e2R(a, u, i + 1);
		}
	} 
}
