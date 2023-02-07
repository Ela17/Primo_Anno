class RicorsioneArrayControvariante {
    static void stampa_array (int[] x) {
        System.out.print("a = [ ");
        for(int i = 0; i < x.length; i++) {
            if(i==x.length-1)
                System.out.println(x[i] + " ]");
            else
                System.out.print(x[i] + ", ");
        }
    }

    static int quanti_pari_contro(int[] a, int i, int r) {  // r è una variabile "risultato"
        if(i < a.length) {
            if(a[i] % 2 == 0)
                return quanti_pari_contro(a, i+1, r+1);
            else
                return quanti_pari_contro(a, i+1, r);
        }
        else
            return r;   // caso base
    }

    static int quanti_pari_wrap(int[] a) {
        return quanti_pari_contro(a, 0);
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 7, 6, 3, 8, 11};
        stampa_array(a);
        System.out.println(quanti_pari_wrap(a) + " elementi pari");
    }
}