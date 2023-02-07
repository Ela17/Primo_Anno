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

public class Gennaio0 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha due parametri formali:
	 *     Il primo parametro e' un riferimento (puntatore) ad una matrice di interi di nome a.
	 *     Il secondo parametro e' un riferimento ad un array di interi di nome b;
	 * --) eUno restituisce la somma di tutti gli elementi e di a per cui esista un elemento
	 *     di b che sia multiplo di e.
	 * La classe Gennaio0TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.  
	 */
    
	public static int eUno(int[][] a, int[] b){
		int s = 0;
		if(a != null && b!= null && a.length > 0 && b.length > 0){
			for(int i = 0; i < a.length; i++){
				if(a[i] != null && a[i].length > 0){
					for(int j = 0; j < a[i].length; j++){
						boolean trovato = false;
						for(int k = 0; k < b.length && !trovato; k++){
							trovato = b[k]%a[i][j] == 0;
							if(trovato) 
								s += a[i][j];
						}
					}
				}
			}
		}
		
		return s;
	}
	
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di interi ed hanno nome a e b;
	 * --) Per ogni posizione i, eDue restituisce la somma delle somme tra a[i] e b[i], a
	 *     patto che il valore esaminato in a superi il corrispondente in b;
	 * --) eDue richiama un metodo ricorsivo co-variante (indice che guida la 
	 *     ricorsione cala con la semplificazione del problema) che esegue 
	 *     effettivamente la somma delle somme.
	 * La classe Gennaio0TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */

	public static int eDue(int[] a, int[] b){
		if(a != null && b != null && a.length > 0 && b.length > 0){
			int len = (a.length <= b.length) ? a.length : b.length;
			return eDueR(a, b, len-1);
		}
		return 0;
	}
	
	public static int eDueR(int[] a, int[] b, int i){
		if(i < 0)
			return 0;
		else{
			if(a[i] > b[i])
				return eDueR(a, b, i-1) + a[i] + b[i];
			else
				return eDueR(a, b, i-1);
		}
	}
	

 }
