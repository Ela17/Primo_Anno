
public class AddizioneConEsecizio {

    public static void main(String[] args) {
        int x = 6;
        int y = 3;

        int s = x;
        int i = 0;
        // ESERCIZIO: capire quale relazione vale per le variabili s,i
        //  alla fine del ciclo.
        System.out.println("-- Prima dell'iterazione  i=" + i);
        System.out.println(i < y);
        while (i < y) {
            // Qui quale relazione esiste tra i e y???? 
            System.out.println("-- Inizio iterazione  i=" + i);
            System.out.println(s == x + i);
            s = s + 1;
            i = i + 1;
            System.out.println(s == x + i);
            System.out.println("-- Fine iterazione  i=" + i);
        }
        System.out.println("-- Uscita");
        System.out.println(s == x + i && i == y); // se è vera questa espressione
        System.out.println(s == x + y); // allora è vera anche questa
        System.out.println();
        System.out.println();

        
        
        // ESERCIZIO: Trovare l'invariante
        //   Completare le equazioni dove compaiono i ???
        int s0 = x;
        int i0 = y;
        System.out.println("-- Prima dell'iterazione " + i0);
        System.out.println("s0 == x + y - i0");
        while (i0 > 0) {
            System.out.println("-- Inizio iterazione " + i0);
            System.out.println("s0 == x + y - i0");
            s0 = s0 + 1;
            i0 = i0 - 1;
            System.out.println("s0 == x + y - i0");
            System.out.println("-- Fine iterazione " + (i0 - 1));
        }
        System.out.println("-- Uscita ");
        // Alla fine del ciclo vale questa condizione
        System.out.println(s0 == x + y); 
    }
}
