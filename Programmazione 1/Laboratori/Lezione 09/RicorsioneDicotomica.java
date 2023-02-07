public class RicorsioneDicotomica {
    
    public static void main(String[] args) {
        // Array ordinato in ordine crescente.
        int[] a1 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
                    43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        //System.out.println(ricercaDicotomica(a1, 19));
        //System.out.println(ricercaDicotomica(a1, 97));
        //System.out.println(ricercaDicotomica(a1, 0));
        
        //System.out.println(ricercaDicotomicaOrdinata(a1, 19));
        //System.out.println(ricercaDicotomicaOrdinata(a1, 97));
        //System.out.println(ricercaDicotomicaOrdinata(a1, 0));
        
        // Cerca tutti gli elementi da 1 a 100 nell'array a 
        for (int i=1; i<=100; i++)
            System.out.print(ricercaDicotomica(a1, i) ? '*' : '.');
        System.out.println("");

        // Cerca tutti gli elementi da 1 a 100 nell'array a,
        // usando il metodo per array ordinati
        for (int i=1; i<=100; i++) 
            System.out.print(ricercaDicotomicaOrdinata(a1, i) ? '*' : '.');
        System.out.println("");
    }
    
    //-------------------------------------------------------------------------
    // Ritorna true se elem esiste nell'array a
    public static boolean ricercaDicotomica(int[] a, int elem) {
        if (a !=null && a.length>0) 
            return ricercaDicotomicaRic(a, elem, 0, a.length-1);
        else
            return false;
    }    
    public static boolean ricercaDicotomicaRic(int[] a, int elem, int i, int j) {
        //System.out.println("  ricercaDicotomicaRic i="+i+" j="+j);
        if (i == j) {
            // CASO BASE: verifica l'elemento i
            return (a[i] == elem);
        }
        else {
            // PASSO INDUTTIVO: dividiamo in due l'intervallo [i,j], 
            // e proseguiamo facendo due chiamate ricorsive sui due sotto-intervalli.
            int m = (i + j) / 2;
            return ricercaDicotomicaRic(a, elem, i, m) ||
                   ricercaDicotomicaRic(a, elem, m+1, j);
        }
    }
    
    //-------------------------------------------------------------------------
    // Ritorna true se elem esiste nell'array a
    // GLI ELEMENTI IN a[] DEVONO ESSERE IN ORDINE CRESCENTE
    public static boolean ricercaDicotomicaOrdinata(int[] a, int elem) {
        if (a !=null && a.length>0) 
            return ricercaDicotomicaOrdinataRic(a, elem, 0, a.length-1);
        else
            return false;
    }    
    public static boolean ricercaDicotomicaOrdinataRic(int[] a, int elem, int i, int j) {
        //System.out.println("  ricercaDicotomicaOrdinataRic i="+i+" j="+j);
        if (i == j) {
            // CASO BASE: verifica l'elemento i
            return (a[i] == elem);
        }
        else {
            // PASSO INDUTTIVO: dividiamo in due l'intervallo [i,j]
            int m = (i + j) / 2;
            // Decidiamo in quale sotto=intervallo proseguire la discesa ricorsiva.
            // Ogni passo induttivo dimezza l'intervallo di ricerca, fino 
            // ad arrivare ad un singolo elemento.
            if (elem <= a[m])
                // se elem esiste, si trova in [i, m].
                return ricercaDicotomicaOrdinataRic(a, elem, i, m);
            else
                // se elem esiste, si trova in [m+1, j]
                return ricercaDicotomicaOrdinataRic(a, elem, m+1, j);
        }
    }
    
    
}