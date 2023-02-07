public class EsameD1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha come unico parametro m un array bidimensionale (matrice) 
	 * di interi; 
	 * -) e1 restituisce true se, per ogni riga, tranne l'ultima,
	 * esiste almeno un elemento che sia strettamente minore di quello 
	 * che occupa la stessa posizione, ma nella riga successiva. 
	 * In ogni altro caso e1 restitusce false.
	 * ATTENZIONE: m[i][j] si riferisce all'elemento di m di riga i e 
	 * colonna j; m.length si riferisce al numero di righe di m;
	 * m[i].length e' il numero di elementi della riga i.
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
		
	public static boolean e1(int[][] m){
		boolean ogniRiga = true;	// mi dice se in ogni riga è rispettata la condizione
		
		if(m != null && m.length > 1) {
			// se la matrice è valida (mi serve che abbia almeno due righe, altrimenti
			// non posso fare il controllo sulla successiva) allora itero su tutte le 
			// righe tranne l'ultima
			for(int i = 0; i < m.length - 1 && ogniRiga; i++){
				boolean esiste = false;	// mi dice se nella riga i-esima esiste l'elemento che rispetti la condizione
				// se la mia riga è valida, allora eseguo una seconda iterazione sulle colonne
				if(m[i] != null && m[i].length != 0){
					for(int j = 0; j < m[i].length && !esiste; j++)
						// se la riga successiva non esiste, non posso eseguire il controllo
						if(m[i+1] != null)
							esiste = m[i][j] < m[i+1][j];
					ogniRiga = esiste;
				}
				else
					ogniRiga = false;
			}
		}
		else
			ogniRiga = false;
		
		return ogniRiga;
	}
		
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha un parametro a, di tipo array di booleani;
	 * -) e2 modifica l'array a, la quale puo' avere struttura arbitraria,
	 * richiamando un metodo void ricorsivo dicotomico e2R 
	 * (due indici individuano l'intervallo su cui opera e2R) con le seguenti 
	 * caratteristiche:
	 * --) e2R riscrive ogni cella in a di posizione dispari con la congiunzione 
	 * tra il contenuto della cella precedente ed il contenuto di quella successiva, 
	 * ammesso che entrambe esistano.
	 * Scrivere la soluzione immediatamente qui sotto.
	 */
	
	public static void e2(boolean[] a){
		if(a != null && a.length > 2) // >2 perchè devo avere almeno 3 elementi per poter applicare il metodo
			e2R(a, 0, a.length-1);
	}
	
	// indice l = left ; indice r = right.
	public static void e2R(boolean[] a, int l, int r){
		if(l == r){	// caso base in cui siamo l e r controllano lo stesso elemento
			if(l % 2 == 1){	// posizione dispari
				// riscrivo la cella con la congiunzione tra a[l-1] e a[l+1]
				// se esistono
				if(l > 0 && l < a.length - 1)
					a[l] = a[l-1] && a[l+1];
			}
		}
		else{
			int m = (l+r)/2; // indice di mezzo
			e2R(a, l, m);	// chiamata dicotomica sul sottovettore sx
			e2R(a, m+1, r);	// chiamata dicotomica sul sottovettore dx 
		}
		
	}
}