public class EsercizioEsame {
    public static int eDue(int[] a, int[] b) {
        if(a == null || b == null || a.length == 0 || b.length == 0)
            return 0;

		return eDueRic(a, b, 0);
    }

    public static int eDueRic(int[] a, int[] b, int i) {
        if(i == a.length || i == b.length)
			return 0;
		else {
			int somma = a[i] - b[i];
			return somma + eDueRic(a, b, i+1);
		}			
    }

    public static void main(String[] args) {
        final int[] a0 = {0,1,2,3,4,5,6,7};
        final int[] a1 = {3,7,9,4,5,12,11};
        final int[] a2 = null; 
        final int[] a3 = {0,10,40,60,20};
		System.out.println(eDue(a0, a1));
		System.out.println(eDue(a1, a0));
		System.out.println(eDue(a2, a3));
		System.out.println(eDue(a0, a3));

    }
}