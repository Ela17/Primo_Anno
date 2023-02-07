import java.util.Scanner;

public class Array {
    public static int[] crea(int n) {
        int[] x = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Inserire un intero: ");
            x[i] = sc.nextInt();
        }
        return x;
    }

    public static boolean uguali(int[] x, int[] y) {
        boolean b = false;
        if(x.length == y.length) {
            b = true;
            for(int i = 0; i < x.length && b; i++)
                if(x[i] != y[i])
                    b = false;
        }
        return b;
    }

    public static boolean uguali_var(int[] x, int[] y) { 
        // algoritmo dicotomico: suddivido il problema in due sottoproblemi e li risolvo separatamente
        int i = -1;
        if(x.length == y.length)
            for(i = 0; i < x.length && x[i] == y[i]; i++);
        
        return i == x.length;
    }

    static void max(int[] a) {
        // porta l'elemento massimo di a in ultima posizione (a.length - 1)
        // confrontando ogni elemento col precedente
        for(int i = 1; i <= a.length - 1; i++)  // parto da i = 1 perchè a[0] non ha precedente
            if (a[i-1] > a[i]) {    // se il precedente è maggiore, li scambio.
                int x = a[i];
                a[i] = a[i-1];
                a[i-1] = x;
            }
    }

    static void max_rel(int[] a, int p) {   // p è una posizione arbitraria in mezzo al vettore a
        // considero solo il sottovettore che va da 0 a p
        // a.length > 1, p < a.length
        for(int i = 1; i <= p; i++)
            if (a[i-1] > a[i]) {
                int x = a[i];
                a[i] = a[i-1];
                a[i-1] = x;
            }
    }

    static void ordina (int[] a) {  
        for(int i = a.length-1; i > 0; i--)
            max_rel(a, i);  // ad ogni chiamata considero il sottovettore sempre più corto.
    }

    public static void main(String[] args) {
        int[] x = crea(4);
        int[] y = {1,2,3,4};
        boolean b = uguali(x, y);
        System.out.println(b);
        int[] z = {3,4,55,2};
        b = uguali_var(x, z);
        System.out.println(b);
    }
}