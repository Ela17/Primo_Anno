public class Stringhe {

    // Un metodo che stampa una linea di separazione, e poi va a capo
    public static void separa() {
        final int NUM_TRATTINI = 40;
        for (int i = 0; i < NUM_TRATTINI; i++)
            System.out.print('-');
        System.out.println();
    }

    public static void main(String[] args) {
        // Dichiarazione di stringhe
        String testo = "Prova";
        String s1 = "Altro testo";
        String s2 = "Il backslash \\ va scritto come due sequenza di due backslash.";
        
        // Stampa a video
        System.out.println(testo);
        System.out.println(s1);
        System.out.println(s2);
        separa();
        
        // La lunghezza di una stringa, cioè il numero di caratteri, si ottiene con il metodo .length()
        System.out.println("La stringa \""+testo+"\" ha "+testo.length()+" caratteri.");
        
        // Le stringhe sono IMMUTABILI. Per fare una modifica, serve sempre riassegnarle.
        // Due stringhe si possono concatenare con l'operatore +, dove la concatenzaione 
        // e' l'operazione che unisce due stringhe in una sola
        String s3 = "Monte ", s4 = "Bianco";
        s3 = s3 + s4; // unisco s3 con s4, e riassegno il risultato 
        System.out.println(s3);
        separa();
        
        // I singoli caratteri di una stringa hanno tipo char.
        // Il carattere in posizione i-esima si ottiene con il metodo charAt(i)
        // ATTENZIONE: il conteggio parte da ZERO.
        // Quindi testo.charAt(0) è il primo carattere della stringa
        System.out.println("Il primo carattere di \""+testo+"\" e': " + testo.charAt(0));
        // Quindi se abbiamo una stringa di lunghezza 5, le posizioni dei caratteri sono:
        //  caratteri:     'P' 'r' 'o' 'v' 'a'
        //  posizioni:      0   1   2   3   4
        // mentre "Prova".length() == 5
        // Segue che l'ultimo carattere e' in posizione length()-1
        System.out.println("L'ultimo carattere di \""+testo+"\" e': " + testo.charAt(testo.length() - 1));
        separa();
        
        // Stampo tutti i caratteri di una stringa, separandoli con una virgola
        String s5 = "Himalaya";
        // NOTA: il loop va da 0 incluso a .length() ESCLUSO
        for (int i = 0; i < s5.length(); i++) {
            System.out.print(s5.charAt(i));
            System.out.print(',');
        }
        System.out.println("");
        
        // A differenza dei tipi interi/booleani/in virgola che abbiamo visto, le stringhe
        // non si confrontano con == e !=, bensì con il metodo .equals
        boolean s1_e_uguale_s3 = s1.equals(s5);
        System.out.println("s1 e' uguale ad s3? " + s1_e_uguale_s3);
        System.out.println("s2 e' uguale ad s3? " + s2.equals(s5));
        System.out.println("s3 e' uguale ad s3? " + s5.equals(s5));
        separa();
        
        // Possiamo estrarre il valore numerico dei caratteri (ASCII/Unicode)
        // in quanto il tipo char e' compatibile con i tipi interi
        String s6 = "ABCDabcd0123";
        for (int i = 0; i < s6.length(); i++) {
            System.out.println("Il carattere \'"+s6.charAt(i)+"\' ha codice: "+(int)s6.charAt(i));
        }
        separa();
        
        // Nota: le lettere maiuscole iniziano dal codice 65 e sono in sequenza alfabetica
        // Simile per le lettere minuscole, che iniziano da 97, e le cifre, che iniziano
        // da 48. Questi numeri sono i codici ASCII/Unicode di queste lettere.
        int ascii_A = (int)'A'; // 65. Il cast ad (int) e' superfluo, in quanto int e' piu' grande di char
        int ascii_a = 'a'; // 97
        int ascii_0 = '0'; // 48
        
        // Possiamo quindi costruire stringhe dai codici numerici delle singole lettere
        String alfabeto = "";
        for (int i = 0; i < 26; i++) {
            // converto la 'A' in intero, aggiungo i e ritorno a carattere
            char lettera = (char)('A' + i); // 65 + i
            // concateno la lettera in fondo alla stringa alfabeto
            alfabeto += lettera;
        }
        System.out.println(alfabeto);
    }
}