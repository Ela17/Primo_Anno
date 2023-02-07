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

public class Gennaio1 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha tre parametri formali di nome a, b, c.
	 *     Ciascuno di essi e' un riferimento (puntatore) ad array di interi
	 * --) eUno restituisce la somma di tutti gli elementi e di a per cui esista 
	 *     un elemento di b inferiore ad e ed un elemento di c superiore ad e.
	 * La classe Gennaio1TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.  
	 */

	public static int eUno(int[] a, int[] b, int[] c){
		int s = 0;
		if(a != null && a.length > 0 && b != null && b.length > 0 && c != null && c.length > 0){
			for(int i = 0; i < a.length; i++){
				boolean inferiore = false;
				boolean superiore = false;
				for(int j = 0; j < b.length && !inferiore; j++)
					inferiore = b[j] < a[i];
				for(int j = 0; j < c.length && inferiore && !superiore; j++)
					superiore = c[j] > a[i];
				if(inferiore && superiore)
					s += a[i];
			}
		}
		return s;
	}
	
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di booleani ed hanno nome a e b;
	 * --) Ammesso che a e b esistano ed abbiano almeno un elemento,
	 *     per ogni posizione i, eDue restituisce il numero disgiunzioni 
	 *     tra a[i] e b[i] che restituiscano il valore false.
	 *     Altrimenti, restituisce 0;
	 * --) eDue richiama un metodo ricorsivo co-variante (indice che guida la 
	 *     ricorsione cala con la semplificazione del problema) che esegue 
	 *     effettivamente il conteggio richiesto.
	 * La classe Gennaio1TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */

	public static int eDue(boolean[] a, boolean[] b){
		int s = 0;
		if(a != null && b != null && a.length > 0 && b.length > 0)
			s = (a.length > b.length) ? eDueR(a, b, b.length-1) : eDueR(a, b, a.length-1);
		return s;
	}
	
	public static int eDueR(boolean[] a, boolean[] b, int i){
		if(i < 0)
			return 0;
		else{
			if(!(a[i] || b[i]))
				return 1 + eDueR(a, b, i-1);
			else
				return eDueR(a, b, i-1);
		}
	}
	
}
