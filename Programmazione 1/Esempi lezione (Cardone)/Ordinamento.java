public class Ordinamento {
/*
    static void max(int[] a) {
        // porta l'elemento massimo di a in ultima posizione, a.length - 1. a.length > 1
        for (int i = 1; i <= a.length-1; i++)
             if (a[i-1] > a[i]) {
                  int x = a[i];
                a[i] = a[i-1];
                a[i-1] = x;          
             } 
    }
    
    static void max_rel(int[] a, int p) {
        /* a.length > 1, p < a.length: porta l'elemento massimo di a in posizione p.
           Il parametro p permette di generalizzare la soluzione precedente
        
        for (int i = 1; i <= p; i++)
             if (a[i-1] > a[i]) {
                  int x = a[i];
                a[i] = a[i-1];
                a[i-1] = x;          
             } 
    }
    
    static void ordina(int[] a) {
        /* Algoritmo di Bubble sort: l'elemento massimo del segmento a[0..p] viene portato
           in posizione p.
        
       for (int i = a.length-1; i > 0; i--)
            max_rel(a,i); 
    }
 */
    public static void scambia(int[] a, int i, int j) {
        int x;
        x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    // vediamo il bubbleSort in maniera ricorsiva:

    // voglio ordinare in modo crescente
    // l'elemento max dell'array arriverà alla fine in posizione finale ( = a.length - 1)
    static void bolli(int[] a, int i) {
        for(int j = 0; j < i; j++){
            if(a[j] > a[j+1])       // se l'elemento successivo è minore, li scambio
                scambia(a, j, j+1);
        }
    }

    static void ordinaRic(int[] a, int i) {
        if(i > 0) {
            bolli(a, i);
            ordinaRic(a, i-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1};
        ordinaRic(a, a.length - 1);
    }
}