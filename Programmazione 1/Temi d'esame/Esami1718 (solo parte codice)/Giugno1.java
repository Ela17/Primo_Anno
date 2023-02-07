/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA È INUTILE CONSEGANRE.
 */

public class Giugno1 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome e1 con le seguenti caratteristiche:
	 * --) e1 ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad un array di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad una matrice di interi di nome b;
	 * --) e1 restituisce il prodotto di tutti gli elementi a[i] in a per cui esista una 
	 *     riga di b nella quale tutti gli elementi sono maggiori di a[i]. 
	 *     Se non esistono righe di b che filtrano elementi di a come indicato, il 
	 *     risultato è 1, cioe' l'elemento neutro della moltiplicazione.
	 * La classe Giugno1TestE1 puo' essere usata per il testing, 
	 * contenendo esempi sul funzionamento atteso per e1. 
	 * SCRIVERE e1 immediatamente al di sotto di questo commento.
	 */
	
	public static int e1(int[] a, int[][] b){
		int p = 1;
		if(a != null && b != null && a.length > 0 && b.length > 0){
			for(int i = 0; i < a.length; i++){
				boolean esiste = false;
				for(int j = 0; j < b.length && !esiste; j++){
					if(b[j] != null && b[j].length > 0){
						boolean ogniElemento = true;
						for(int k = 0; k < b[j].length && ogniElemento; k++)
							ogniElemento = a[i] < b[j][k];
						esiste = ogniElemento;
						if(esiste)
							p *= a[i];
					}
				}
			}
		}
		return p;
	}
	
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome e2 con le seguenti caratteristiche:
	 * --) e2 ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi, hanno nome a e b e possono essere di diversa lunghezza;
	 * --) e2 restituisce il puntatore (reference) all'array b modificato come segue:
	 *     ogni valore pari in b e' sostituito col valore del corrispondente elemento in a;
	 * --) e2 richiama un metodo ricorsivo di tipo void e dicotomico che esegue effettivamente 
	 *     il rimpiazzo dei valori in b con quelli di a.
	 * La classe Giugno1TestE2 puo' essere usata per il testing di e2,
	 * contenendo esempi sul funzionamento atteso per e2. 
	 * SCRIVERE e2 immediatamente al di sotto di questo commento.
	 */
	
	public static int[] e2(int[] a, int[] b){
		if(a != null && b != null && a.length > 0 && b.length > 0){
			int len = (a.length > b.length) ? b.length : a.length;
			e2R(a, b, 0, len-1);
		}
		return b;
	}
	
	public static void e2R(int[] a, int[] b, int l, int r){
		if(l==r){
			if(b[l]%2 == 0)
				b[l] = a[l];
		}
		else{
			int m = (l+r)/2;
			e2R(a, b, l, m);
			e2R(a, b, m+1, r);
		}
	}
}
