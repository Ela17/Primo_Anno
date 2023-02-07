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

public class Febbraio2 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * (Per ogni/esiste)
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad una array di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad una matrice di interi di nome b;
	 * --) eUno restituisce la somma di tutti gli elementi e di a per cui esista un elemento
	 *     di b che sia multiplo di e.
	 * La classe Febbraio2TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.
	 */

	public static int eUno(int[] a, int[][] b){
		int s = 0;
		if(a != null && a.length > 0 && b != null && b.length > 0){
			for(int i = 0; i < a.length; i++){
				boolean esiste = false;
				for(int r = 0; r < b.length && !esiste; r++){
					if(b[r] != null && b[r].length > 0)
						for(int c = 0; c < b[r].length && !esiste; c++)
							esiste = b[r][c]%a[i] == 0;
				}
				if(esiste)
					s += a[i];
			}
		}
		return s;
	}
	
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi ed hanno nome a e b;
	 * --) eDue restituisce la somma delle differenze tra a[i] e b[i], a
	 *     patto che il valore esaminato in a superi il corrispondente in b;
	 * --) eDue richiama un metodo ricorsivo contro-variante (indice che guida la 
	 *     ricorsione sale con la semplificazione del problema) che esegue 
	 *     effettivamente la somma delle differenze.
	 * La classe Febbraio2TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */

	public static int eDue(int[] a, int[] b){
		int r = 0;
		if(a != null && b != null && a.length > 0 && b.length > 0)
			r = eDueR(a, b, 0);
		return r;
	}
	
	public static int eDueR(int[] a, int[] b, int i){
		if(i == a.length || i == b.length)
			return 0;
		else{
			if(a[i] > b[i])
				return eDueR(a, b, i+1) + a[i] - b[i];
			else
				return eDueR(a, b, i+1);
		}
	}
}
