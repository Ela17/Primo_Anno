import java.util.Scanner;

public class MetodiSuArray {

	/* ESERCIZIO 1 */
    public static int[] initArrayInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensione > ");
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            System.out.print("Elemento " + i + " > ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void stampaArray(int[] a) {
        System.out.print("[ ");
        for(int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " ");
        System.out.println("]");
    }
	
	/* ESERCIZIO 2 */
	public static void copiaElementi(int[] from, int[] to) {
		for(int i = 0; i < from.length; i++)
			to[i] = from[i];
	}
	
	public static int[] clonaArray(int[] a) {
		if (a == null) 
			return null;
		
		int[] copia = new int[a.length];
		copiaElementi(a, copia);
		
		return copia;
	}	
	
	/* ESERCIZIO 3 */
	public static int[] filtroMinoriDi(int[] a, int limiteSuperiore) {
		int i = 0, n = 0;
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] < limiteSuperiore) 
				n++;			
		}
		
		int[] minore = new int[n];
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] < limiteSuperiore) 
				minore[i++] = a[j];			
		}
		
		return minore;
	}

	public static int[] filtroIntervalloDisp(int[] a, int min, int max) {
		int n = 0;
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] % 2 != 0 && (a[j] >= min && a[j] <= max)) 
				n++;			
		}
		
		int[] dispari = new int[n];
		int i = 0;
		for(int j = 0; j < a.length; j++) {
			if((a[j] % 2 != 0) && (a[j] >= min && a[j] <= max)) 
				dispari[i++] = a[j];			
		}
		
		return dispari;
	}	
	
	public static boolean[] trasduttore(int[] a, int limiteSuperiore) {
		boolean[] b = new boolean[a.length];
		
		for(int i = 0; i < a.length; i++) 
			b[i] = (a[i] <= limiteSuperiore);
		
		return b;
	}	
	
	public static void stampaArrayBoolean(boolean[] a) {
		System.out.print("[ ");
        for(int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " ");
        System.out.println("]");
	}	
	
	/* ESERCIZIO 4 */
	public static boolean eqArray_It(int[] a, int[] b){
		if(a == null || b == null || a.length != b.length)
			return false;

		for(int i = 0; i < a.length; i++)
			if(a[i] != b[i])
				return false;
			
		return true;
	}	
	
	public static boolean eqArrayRic_wrap(int[] a, int[] b) {
		if(a == null || b == null || a.length != b.length)
			return false;
		return eqArrayRic(a, b, 0);
	}
	
	public static boolean eqArrayRic(int[] a, int[] b, int i) {
		if(i == a.length)
			return true;
		
		if(a[i] != b[i])
			return false;
		else
			return true && eqArrayRic(a, b, i+1);
	}	
	
	public static boolean tuttiPariMaggioriDi_It(int[] a, int num) {
		if(a == null)
			return false;

		for(int i = 0; i < a.length; i++)
			if(a[i]%2 != 0 || a[i] <= num)
				return false;
			
		return true;
	}	
	
	public static boolean tuttiPariMaggioriDi_Ric_wrap(int[] a, int num) {
		if(a == null)
			return false;
		return tuttiPariMaggioriDi_Ric(a, num, 0);
	}	
	
	public static boolean tuttiPariMaggioriDi_Ric(int[] a, int num, int i) {
		if(i == a.length)
			return true;
		
		if(a[i]%2 != 0 || a[i] <= num)
			return false;
		else
			return true && tuttiPariMaggioriDi_Ric(a, num, i+1);
	}
	
	/* ESERCIZIO 5 */
	public static int indiceSubSeq(int[] a, int[] b) {
		boolean trovato = false;
		int occ = -1, j = 0;
		
		for(int i = 0; i < a.length && j < b.length; i++) {
			if(b[j] == a[i] && !trovato) {
				trovato = true;
				occ = i;
				j++;
			}
			else if(b[j] == a[i] && trovato)
				j++;
			else if(b[j] != a[i] && trovato) {
				trovato = false;
				j = 0;
			}
		}
		
		if(trovato)
			return occ;
		else 
			return -1;
	}
}
