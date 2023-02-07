class ProvaRicorsioneArray {
    static void stampa (boolean[] x) {
        for(int i = 0; i < x.length; i++){
            if(i==x.length-1)
                System.out.print(x[i]);
            else 
                System.out.print(x[i] + " && ");
        }
    }

    static void stampa_array (int[] x) {
        System.out.print("a = [ ");
        for(int i = 0; i < x.length; i++) {
            if(i==x.length-1)
                System.out.println(x[i] + " ]");
            else
                System.out.print(x[i] + ", ");
        }
    }

    static int quanti_pari(int[] a, int i) {
        if(i < a.length) {
            if(a[i] % 2 == 0)
                return 1 + quanti_pari(a, i + 1);
            else
                return quanti_pari(a, i + 1);
        }
        else
            return 0;   // caso base
    }

    // cambia da quella sopra solo nella forma
    static int quanti_pari_piuBella(int[] a, int i) {
        if(i == a.length)   // la base induttiva compare all'inizio
            return 0;
        else {
            if(a[i] % 2 == 0)
                return 1 + quanti_pari(a, i + 1);
            else
                return quanti_pari(a, i + 1);
        }
    }

    static int quanti_pari_iterativa(int[] a) {
        int cnt = 0;    // variabile contatore che viene incrementata se a[i] è pari
        int i = 0;
        while(i < a.length) {   // invariante: cnt == numero di pari in a[0,...,i-1]
            if(a[i] % 2 == 0)
                cnt++;
            i++;
        }
        return cnt;
    }

    static int quanti_pari_wrap(int[] a) {
        return quanti_pari_piuBella(a, 0);
    }

    static boolean congiunzione(boolean[] a, int i) {  // a = array di boolean
        // calcola con ricorsione controvariante la congiunzione di tutti
        // gli elementi in a
        if(i == a.length)
            return true;    // restituisco l'elemento neutro della congiunzione
                            // infatti true AND true == true
                            //         true AND false == false
        else
            return a[i] && congiunzione(a, i+1);
    }

    static boolean congiunzione_wrap(boolean[] a) {
        return congiunzione(a, 0);
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 7, 6, 3, 8, 11};
        stampa_array(a);
        System.out.println("versione iterativa:\n" + quanti_pari_iterativa(a) + " elementi pari");
        System.out.println("versione ricorsiva:\n" + quanti_pari_wrap(a) + " elementi pari");
        System.out.println();
        
        boolean[] b = { true, false, 5 < 3, true && false, true || false};
        stampa(b);
        System.out.println(" = " + congiunzione_wrap(b));
    }
}