class EserciziMatrici{
	public static int[] clonaArray(int[] a){
		if(a == null)
			return null;
		
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
			b[i] = a[i];
		
		return b;
	}
	
	public static int[][] initAlt(int[] matp, int[] matd, int numr) {
		int[][] m = new int[numr][];
		
		if(matp == null && matd == null)
			return null;
		
		for(int i = 0; i < numr; i++){
			if(i%2 == 0)
				m[i] = clonaArray(matp);
			else 
				m[i] = clonaArray(matd);
		}
		
		return m;		
	}
	
	public static int contaElementi(int[][] m) {
		if(m == null)
			return 0;
		int s = 0;
		for(int i = 0; i < m.length; i++){
			if(m[i] != null)
				s += m[i].length;
		}
		return s;
	}
	
	public static int[] linearizzaRighe(int[][] mat) {
		int n = 0;
		int[] a = new int[contaElementi(mat)];
		
		if(mat == null)
			return null;
		
		for(int i = 0; i < mat.length; i++){
			if(mat[i] != null){
				for (int j = 0; j < mat[i].length; j++)
					a[n++] = mat[i][j];		
			}
		}
		
		return a;
	}
	
	public static String toString(int[][] m) {
		String s = "";
		for(int i = 0; i < m.length; i++){
			if(m[i] == null)
				s = s + "\n";
			else{
				for (int j = 0; j < m[i].length; j++)
					s = s + m[i][j] + " ";
				s = s + "\n";
			}
		}
	
		return s;
	}
	
	public static void stampa(int[] a){
		if(a != null)
			for(int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static int maxRowLen(int[][] m){
		int max = 0;
		if(m != null){		
			for(int i = 0; i < m.length; i++){
				if(m[i] != null)
					if(m[i].length > max)
						max = m[i].length;
			}
		}
		
		return max;
	}
	
	public static int[] sommaRighe(int[][] m){
		if(m == null)
			return null;
		
		int[] a = new int[maxRowLen(m)];
		int j = 0, s = 0;
		
		do{
			for(int i = 0; i < m.length; i++){
				if(m[i] != null && m[i].length > j){
					s += m[i][j];
				}
			}
			a[j] = s;
			j++;
			s=0;
		}while(j < maxRowLen(m));

		return a;
	}

	static void azzeraColonnaMax(int[][] max) {
		if(max == null)
			return;
		
		int[] len_colonne = sommaRighe(max);
		int big = 0, pos=0;
		
		for(int i = 0; i < len_colonne.length; i++){
			if(big < len_colonne[i]){
				big = len_colonne[i];
				pos = i;
			}
		}
		
		for(int i = 0; i < max.length; i++){
			if(pos < max[i].length)
				max[i][pos] = 0;
		}
	}
	
	public static boolean domRiga(int[] r, int j) {
		boolean trovato = true;
		
		for(int i = 0; i < r.length && trovato; i++){
			trovato = (r[i] % j == 0);
		}
	
		return trovato;
	}
	
	public static boolean domMat(int[][] mat) {
		boolean dominante = true;
		boolean trovato = false;
		
		if(mat != null) {
			for(int i = 0; i < mat.length && dominante; i++){
				if(mat[i] != null) {
					for(int j = 0; j < mat[i].length && !trovato; j++)
						trovato = domRiga(mat[i], mat[i][j]);
					dominante = trovato;
				}
			}
		}
		return dominante;
	}
	
	static void incrementaRiga(int[] in, int[] out, int k){
		if(in != null){	
			if(k < 0)
				return;
			else{
				out[k] = in[k] + 1;
				incrementaRiga(in, out, k - 1);		
			}
		}
	}
	
	public static int[][] incrementa(int[][] imat){
		if(imat == null)
			return null;
		else
			return incrementaRic(imat, 0);
	}
	
	public static int[][] incrementaRic(int[][] imat, int i){
		if(i == imat.length)
			return new int[imat.length][];
		else{
			int[][] omat = incrementaRic(imat, i + 1);
			if(imat[i] != null){
				omat[i] = new int[imat[i].length];
				incrementaRiga(imat[i], omat[i], imat[i].length - 1);
			}
			return omat;
		}
	}
	
	public static int conteggio(int[] a, int k) {
		if(a==null)
			return 0;
		return conteggioDicotomico(a, k, 0, a.length-1);
	}
	
	public static int conteggioDicotomico(int[] a, int k, int l, int r) {
		if(r==l){
			if(a[l] == k)
				return 1;
			return 0;
		}
		else{
			int m = (l+r)/2;
			return conteggioDicotomico(a, k, l, m) + conteggioDicotomico(a, k, m+1, r);
		}	
	}
	
	public static void main(String[] args) {
		int[] a1 = {3,5,7}, a2 = {2,10,8,9}, a3 = {8};
		int[][] m1 = initAlt(a1, a2, 6), m2 = initAlt(a3, null, 5), m3 = initAlt(null, a2, 4);
		/*stampa(linearizzaRighe(m1));
		stampa(linearizzaRighe(m2));
		stampa(linearizzaRighe(m3));*/
		
		int[][] m4 = { {2,5,6}, {3,7,8,9,1}, {0,2}, {0,3,9,1} };
		/*stampa(sommaRighe(m1));
		stampa(sommaRighe(m2));
		stampa(sommaRighe(m3));
		stampa(sommaRighe(m4));
		azzeraColonnaMax(m4);
		stampa(sommaRighe(m4));
		azzeraColonnaMax(m4);
		stampa(sommaRighe(m4));
		azzeraColonnaMax(m4);
		stampa(sommaRighe(m4));
		azzeraColonnaMax(m4);
		stampa(sommaRighe(m4));*/
		
		int[][] m5 = { {1, 5, 10, 7}, {3, 12, 21, 30}, {5, 10, 20, 30} }; // true
		int[][] m6 = { {4, 7, 2, 5}, {7, 9, 20, 12}, {5, 8, 11, 21} }; // false
		/*System.out.println(domMat(m5));
		System.out.println(domMat(m6));
		System.out.println(toString(m1));
		System.out.println(toString(incrementa(m1)));
		System.out.println(toString(m2));
		System.out.println(toString(incrementa(m2)));
		System.out.println(toString(m3));
		System.out.println(toString(incrementa(m3)));
		System.out.println(toString(m4));
		System.out.print(toString(incrementa(m4)));*/
		
		int[] a4 = { 3, 5, 3, 2, 3, 6, 3, 2, 3, 3, 8, 3};
		System.out.println(conteggio(a4, 3));
		System.out.println(conteggio(a4, 2));
		
	}
}