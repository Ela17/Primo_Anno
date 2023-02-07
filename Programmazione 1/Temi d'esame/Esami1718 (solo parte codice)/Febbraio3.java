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

public class Febbraio3 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha tre parametri formali di nome a, b, c.
	 *     Ciascuno di essi e' un riferimento (puntatore) ad array di interi
	 * --) eUno restituisce la somma di tutti gli elementi e di a che siano maggiori
	 *     di ogni elemento di b ed inferiori ad almeno un elemento di c.
	 * La classe Febbraio3TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.  
	 */

	public static int eUno(int[] a, int[] b, int[] c){
		int s = 0;
		if(a != null && a.length > 0 && b != null && b.length > 0 && c != null && c.length > 0){
			for(int i = 0; i < a.length; i++){
				boolean maggiore = true;
				boolean minore = false;
				for(int j = 0; j < b.length && maggiore; j++)
					maggiore = a[i] > b[j];
				for(int j = 0; j < c.length && maggiore && !minore; j++)
					minore = a[i] < c[j];
				if(maggiore && minore)
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
	 *     per ogni posizione i, eDue restituisce la disgiunzione delle congiunzioni 
	 *     tra a[i] e b[i], a patto che l'indice i sia pari.
	 *     Altrimenti, restituisce false;
	 * --) eDue richiama un metodo ricorsivo contro-variante (indice che guida la 
	 *     ricorsione cresce con la semplificazione del problema) che esegue 
	 *     effettivamente la disgiunzione delle congiunzioni.
	 * La classe Febbraio3TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */

	public static boolean eDue(boolean[] a, boolean[] b){
		boolean ris = false;
		if(a != null && a.length > 0 && b != null && b.length > 0)
			ris = eDueR(a, b, 0);
		return ris;
	}
	
	public static boolean eDueR(boolean[] a, boolean[] b, int i){
		if(i == a.length || i == b.length)
			return false;
		else{
			if(i%2 == 0)
				return eDueR(a, b, i+2) || (a[i] && b[i]);
			else
				return eDueR(a, b, i+1);
		}
	}

}
