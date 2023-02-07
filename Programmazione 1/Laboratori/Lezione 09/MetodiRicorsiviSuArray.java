public class MetodiRicorsiviSuArray {
	public static boolean tuttiPari(int[] a) {
		return tuttiPariRic(a, a.length - 1);
	}
	
	public static boolean tuttiPariRic(int[] a, int i) {
		if(i < 0)
			return true;
		else {
			return (a[i]%2 == 0) && tuttiPariRic(a, i-1);
		}
	}
	
	public static boolean esisteMultiplo(int[] a, int m) {
		return esisteMultiploRic(a, m, 0);
	}
	
	public static boolean esisteMultiploRic(int[] a, int m, int i) {
		if(i == a.length)
			return false;
		else {
			return (a[i]%m == 0) || esisteMultiploRic(a, m, i+1);
		}
	}
	
	public static int sommaDispari(int[] a){
		if(a == null || a.length == 0)
			return 0;
		return sommaDispariDic(a, 0, a.length-1);
	}
	
	public static int sommaDispariDic(int[] a, int i, int j){
		if(i == j) {
			if(a[i]%2 != 0)
				return a[i];
			else 
				return 0;
		}
		return sommaDispariDic(a, i, (i+j)/2) + sommaDispariDic(a, (i+j)/2 + 1, j);
	}
	
	public static int indiceMassimo(int[] a){
		if(a == null || a.length == 0)
			return -1;
		return indiceMassimoDic(a, 0, a.length-1);
	}
	
	public static int indiceMassimoDic(int[] a, int i, int j){
		if(i == j) 
			return j;
		else{
			int m = (i+j)/2;
			int maxSx = indiceMassimoDic(a, i, m);
			int maxDx = indiceMassimoDic(a, m+1, j);
			if(a[maxSx] < a[maxDx])
				return maxSx;
			else 
				return maxDx;
		}
	}
	
	public static int[] filtraMaggioriDi(int[] a, int limiteInferiore){
		if(a == null || a.length == 0)
			return null;
		return filtraMaggioriDiRic(a, limiteInferiore, a.length-1, 0);
	}
	
	public static int[] filtraMaggioriDiRic(int[] a, int l, int i, int cnt){
		if(i < 0)
			return new int[cnt];
		else {
			if(a[i] > l){
				int[] m = filtraMaggioriDiRic(a, l, i-1, cnt+1);
				m[cnt] = a[i];
				return m;
			}
			else {
				int[] m = filtraMaggioriDiRic(a, l, i-1, cnt);
				return m;
			}
			
		}
			
	}
	
	public static int[] filtraPari(int[] a){
		if(a == null)
			return null;
		if(a.length == 0)
			return new int[0];
		return filtraPariDic(a, 0, a.length-1);
	}
	
	public static int[] filtraPariDic(int[] a, int i, int j){
		if(i == j) {
			if(a[i]%2 == 0) {
				int[] p = new int[1];
				p[0] = a[i];
				return p;
			}
			else 
				return new int[0];
		}
		int m = (i+j)/2;
		return concatena(filtraPariDic(a, i, m), filtraPariDic(a, m+1, j));			
	}

	public static int[] concatena(int[] a, int[] b){
		int[] array = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++)
			array[i] = a[i];
		for(int i = 0; i < b.length; i++)
			array[i + a.length] = b[i];
		
		return array;
	}
	
	public static void main(String[] args){/*
			int[] array = LeggiArray.leggiArrayInt();
			System.out.println("tutti pari: " + tuttiPari(array));
			System.out.println("contiene multipli di 5: " + esisteMultiplo(array, 5));
			
			final int[] a0 = {0,1,2,3,4,5,6,7}; // 16
			final int[] a1 = {3,7,9,4,5,12,11}; // 35
			final int[] a2 = null; 				// 0
			final int[] a3 = {0,10,40,60,20}; 	// 0
			
			System.out.println(sommaDispari(a0));
			System.out.println(sommaDispari(a1));
			System.out.println(sommaDispari(a2));
			System.out.println(sommaDispari(a3));
			
			
			final int[] altezze = {5895, 4810, 6194, 4897, 4884, 8848, 6962};
			final String[] nomi = { "Kilimangiaro", "Monte Bianco", "Monte Denali", "Massiccio Vinson", "Puncak Jaya", "Everest", "Aconcagua"};
			int i = indiceMassimo(altezze);		
			if(i != -1)			
				System.out.println(nomi[i] + " " + altezze[i]);
			*/
			final int[] a0 = {0,1,2,3,4,5,6,7}; 
			final int[] a1 = {3,7,9,4,5,12,11};
			final int[] a2 = null; 				
			final int[] a3 = {0,10,40,60,20};			
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a0, 3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a1, 3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a2, 3));
			LeggiArray.stampaArrayInt(filtraMaggioriDi(a3, 3));

	}
}