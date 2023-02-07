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
 public class Settembre1 {

    /* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * Per risolvere questo esercizio occorre scrivere due metodi, uno di nome palindromo,
     * l'altro di nome e1, descritti qui di seguito.
     * Il metodo palindromo:
     * - ha un unico parametro formale di nome str e di tipo reference ad array di char;
     * - restituisce true se e solo se la stringa di caratteri memorizzata in str e' palindroma,
     *   assumendo che anche la sequenza con zero caratteri sia palindroma.
     *   Per semplicita', ipotizzare che i caratteri in str siano solo minuscoli.
     * Il metodo e1:
     * - e' iterativo;
     * - ha un unico parametro formale di nome frasi e di tipo riferimento ad array di array di char;
     * - e1 restituisce un array a di boolean tale che:
     *   --) a ha tanti elementi quante sono le righe in frasi
     *   --) a[i]==true se e solo se frasi[i] e' un palindroma;
     * Il metodo e1 deve utilizzare il metodo palindromo.
     * Se frasi e' null il metodo e1 deve restituire null.
     * 
     * La classe Settembre1TestE1 puo' essere usata per il testing, 
     * contenendo esempi sul funzionamento atteso per e1.
     * SCRIVERE e1 immediatamente al di sotto di questo commento.
     */
	public static boolean palindromo(char[] str){
		if(str == null)
			return false;
		boolean palindroma = true;
		int len = str.length;
		for(int i = 0; i < len && palindroma; i++)
			palindroma = str[i] == str[len-i-1];
		return palindroma;
	}
	
	public static boolean[] e1(char[][] frasi){
		if(frasi == null)
			return null;
		boolean[] a = new boolean[frasi.length];
		if(frasi.length > 0){
			for(int i = 0; i < frasi.length; i++)
				a[i] = palindromo(frasi[i]);
		}
		return a;
	}
	 
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
     * Per risolvere questo esercizio occorre scrivere i metodi ruota ed e2.
	 * Il metodo ruota deve essere ricorsivo, ha signature:  
	 * 
	 *          private static void ruota(char[] a, int i)
	 * 
	 * modifica a ruotando il suo sotto-array dall'indice i ad a.length-1-i rispetto al punto mediano.
     *						  
	 * Il metodo es2:
	 * -) ha un unico parametro formale di nome str di tipo reference ad array di char;
	 * -) ruota str rispetto alla sua posizione mediana invocando ruota;
	 * -) restituisce il reference all'array str modificato se esso non e' null. 
	 *    Altrimenti, il risultato e' null.
	 *
	 * La classe Settembre1TestE2 puo' essere usata per il testing di e2,
	 * contenendo esempi sul funzionamento atteso per e2. 
	 * SCRIVERE e2 immediatamente al di sotto di questo commento.
	 */

    private static void ruota(char[] a, int i){
		int m = a.length / 2;
		if(i < m){
			char tmp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = tmp;
			ruota(a, i+1);
		}
	}
	
	public static char[] e2(char[] str){
		if(str != null && str.length > 0)
			ruota(str, 0);
		
		return str;
	}
}
