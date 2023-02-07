class Metodi {  // in questa classe proviamo metodi ricorsivi

    // metodo iterativo per calcolo del fattoriale
    public static int FattIt (int n) {
        // condizione di ingresso: n >= 0
        int i = 0;
        int r = 1;
        while (i < n) { // invariante: r == i!
            i = i + 1;
            r = i * r;
        }
        return r;
    }

    // metodo ricorsivo per calcolo del fattoriale
    public static int Fatt (int n) {
        // condizione di ingresso: n >= 0
        if (n == 0) return 1;   // 0! == 1 (caso base della ricorsione)
        else    
            return n * Fatt(n - 1); // ad ogni passo moltiplichiamo il valore di n per il suo precedente;
    }

    public static void main (String[] args) {
        System.out.println("Scrivere un numero naturale, seguito da Invio: ");
        int n = SIn.readLineInt();
        System.out.println("Metodo iterativo: Il fattoriale di " + n + "è: " + FattIt(n));
        System.out.println("Metodo ricorsivo: Il fattoriale di " + n + "è: " + Fatt(n));
    }

}

/*
 * SPIEGAZIONE DELLA RICORSIONE:
 * 
 * Fatt(4)  = 4 * Fatt(3)
 *          = 4 * 3 * Fatt(2)
 *          = 4 * 3 * 2 * Fatt(1)
 *          = 4 * 3 * 2 * 1 * Fatt(0)       arrivo fino al caso base, ovvero n == 0
 *          = 4 * 3 * 2 * 1 * 1         ritorno 0! = 1
 *          = 4 * 3 * 2 * 1             eseguo 1 * 1 (ovvero 1!) e ritorno
 *          = 4 * 3 * 2                 eseguo 2 * 1 (ovvero 2!) e ritorno
 *          = 4 * 6                     eseguo 3 * 2 * 1 (ovvero 3!) e ritorno 
 *          = 24                        eseguo 4 * 3 * 2 * 1 (ovvero 4!) e ritorno 
 *          (fine ricorsione)
 *
 * 
 * 
 *  Dimostrare che, per ogni n>=0, Fatt(n)==n!   per induzione su n.
 * 
 *  Base dell'induzione:    n==0, e Fatt(0)=1=0!, quindi la base è vera.
 *  Passo induttivo:        assumiamo che n>0, e assumiamo (ipotesi induttiva) che Fatt(n-1)==(n-1)!
 * 
 *  Bisogna riuscire a dimostrare che allora Fatt(n)==n!
 * 
 *  Fatt(n) = n * Fatt(n - 1)   (per la definizione del metodo Fatt)
 *          = n * (n - 1)!      (per l'ipotesi induttiva)
 *          = n!                (per la definizione matematica di funzione fattoriale)
 * 
 *  Per una applicazione del principio di induzione, si conclude che, per ogni n>=0, Fatt(n)==n!
 * 
 */