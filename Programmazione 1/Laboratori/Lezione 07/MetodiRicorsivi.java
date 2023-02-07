import java.util.Scanner;

public class MetodiRicorsivi {
    /*  ESERCIZIO 1
     *  ad ogni chiamata di sommatoriaRicorsiva viene chiesto 
     *  un numero che viene sommato ai successivi
     *  (la somma viene "tramandata" come parametro del metodo
     *  infatti nella primissima chiamata è settata a 0)
     * 
     *  Quando l'utente inserisce valore nullo, la ricorsione
     *  si ferma e ritorna la somma calcolata fin ora.
     */
    public static int sommatoriaRicorsiva() {
        System.out.print("Inserire un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0)
            return 0;
        else 
            return n + sommatoriaRicorsiva ();
    }

    /*  ESERCIZIO 2
     *  prende in input una stringa s ed un carattere c, e ritorna 
     *  true se il carattere indicato è presente nella stringa.
     * 
     *  Utilizzato un metodo wrapper "di facciata" che al suo interno
     *  chiama il vero metodo ricorsivo tenendo conto anche dell'indice
     *  di scorrimento della stringa (inizializzato a 0)
     */
    public static boolean trovaCarattere(String s, char c) {
        return trovaCarattereRic(s, c, 0);
    }

    public static boolean trovaCarattereRic(String s, char c, int i) {
        if (i == s.length())
            return false;
        else {
            if (s.charAt(i) == c)
                return true;
            else
                return trovaCarattereRic(s, c, i+1);
        }
    }      
        

    /*  ESERCIZIO 2
     *  prende in input una stringa ed un carattere, e ritorna 
     *  il numero di occorrenze del carattere indicato.
     *  
     *  Utilizzato un metodo wrapper "di facciata" che al suo interno
     *  chiama il vero metodo ricorsivo tenendo conto anche dell'indice
     *  di scorrimento della stringa (inizializzato a 0)
     *  
     *  Ad ogni chiamata ricorsiva ritorno il il numero di occorrenze aggiornato.
     */
    public static int contaCaratteri(String s, char c) {
        return contaCaratteriRic(s, c, 0);
    }

    public static int contaCaratteriRic(String s, char c, int i) {
        if(i == s.length())
            return 0;
        else{
            if (s.charAt(i) == c) 
                return 1 + contaCaratteriRic(s, c, i+1);
            else
                return contaCaratteriRic(s, c, i+1);
        }
        
    }

    /*  ESERCIZIO 3
     *  prende una stringa e dice se è palindroma o no.
     * 
     *  Nella chiamata ricorsiva tengo conto dell'indice di
     *  scorrimento della stringa in modo da confrontare
     *  primo char con ultimo, secondo con penultimo e 
     *  così via fino ad arrivare a metà lunghezza.
     */
    public static boolean palindroma(String s) {
        return palindromaRic(s, 0); // i parte da 0
    }

    public static boolean palindromaRic(String s, int i){
        if (i > s.length()/2)
                return true;
        else {
            if(s.charAt(i) == s.charAt(s.length()-1-i))
                return true && palindromaRic(s, i+1);
            else
                return false;
        }
    }

    /*  ESERCIZIO 4 */
    public static String conversioneCaratteri(String s) {
        return conversioneCaratteriR(s, s.length()-1);
    }

    public static String conversioneCaratteriR(String in, int i) {
        if(i < 0)   // i parte dall'ultimo carattere e scorre fino al primo
            return "";
        // se è una vocale stampo *
        if(in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u' || in.charAt(i)=='A' || in.charAt(i)=='E' || in.charAt(i)=='I' || in.charAt(i)=='O' || in.charAt(i)=='U')
            return conversioneCaratteriR(in, i-1) + "*";
        // se non è una vocale ma comunque una lettera dell'alfabeto stampo $
        else if((in.charAt(i)>'A' && in.charAt(i)<='Z') || (in.charAt(i)>'a' && in.charAt(i)<='z'))
            return conversioneCaratteriR(in, i-1) + "$";
        // altrimenti stampo -
        return conversioneCaratteriR(in, i-1) + "-";
    }

    /*  ESERCIZIO 5
     *  partendo dal primo carattere scorro il vettore fino alla fine
     *  una volta arrivata alla fine stampo ogni carattere tornando indietro.
    */
    public static String stringaInversa(String s) {
        return stringaInversaR(s, 0);
    }

    public static String stringaInversaR(String in, int i) {
        if(i == in.length())
            return "";
            // stringa.concat(...) concatena due stringhe per renderle una
        return stringaInversaR(in, i+1) + in.charAt(i);
    }

    /*  ESERCIZIO 6 (ammetto di aver avuto molta difficoltà ed essermi aiutata con le soluzioni)*/
    public static String eliminaCarattere(String s, int i) {
        return eliminaCarattereR(s, i, 0);
    }

    /*  quando l'indice i diventa uguale alla posizione del carattere che voglio eliminare
     *  trasformo quel carattere in una stringa vuota "".
     */
    public static String eliminaCarattereR(String s, int pos, int i) {
        if(i==s.length())
            return "";
        else {
            if(i == pos)
                return eliminaCarattereR(s, pos, i+1);
            else
                return s.charAt(i) + eliminaCarattereR(s, pos, i+1);
        }
    }

    // all'inizio s è la stringa intera e s_perm è una stringa vuota (sarà la permutazione)
    public static void permutazioniStringa(String s) {
        permutazioniStringaR(s, 0, "");
    }

    /*
     * il mio scopo è: spostare uno alla volta i char di s per comporre la permutazione
     */
    public static void permutazioniStringaR(String s, int i, String s_perm) {
        if(i>=s.length() && s.length()>0)  // se i arriva a fine stringa (non nulla)
            return;                              // --> ritorno. Perchè non c'è più nessun char da controllare
        else if(s.length() == 0) // abbiamo eliminato tutti i caratteri da s (quindi la stringa permutata è "piena")
            System.out.println(s_perm); // stampo la permutazione
        else {
            // elimino il char i-esimo e lo "sposto" nella permutazione
            // poi chiamo ricorsivamente ricominciando dal primo carattere
            // ma su una stringa che possiede un carattere in meno
            permutazioniStringaR(eliminaCarattere(s, i), 0, s_perm + s.charAt(i));  
            // chiamo ancora ricorsivamente. incremento i.
            permutazioniStringaR(s, i+1, s_perm);   
        }
    }

    public static void main(String[] args){}
}