public class MatriciBase {
	public static int[][] creaMatrice1(int dim){
		int[][] m = new int[dim][dim];
		for(int i = 0; i < dim; i++) 
			for(int j = 0; j < dim; j++) 
				m[i][j] = i*j;		
		return m;
	}
	
	public static int[][] creaMatrice2(int dim){
		int[][] m = new int[dim][];
		int[] r0 = {8,3,2,4,1,6,9,1};
		m[0] = r0;
		for(int i = 1; i < dim; i++) {
			int[] r = new int[m[i-1].length-1];
			for(int j = 0; j < r.length; j++)
				r[j] = m[i-1][j] + m[i-1][j+1];
			m[i] = r;
		}
		return m;
	}
	
	public static void main(String[] args){
		final int[][] mat1 = { {1,0,0}, {0,1,0}, {0,0,1} };
		final int dim = 10, N = 8;
		int[][] mat2 = creaMatrice1(dim);
		int[][] mat3 = creaMatrice2(N);
		
		ArrayDiArrays.stampaMatrice(mat2);
		System.out.println();
		ArrayDiArrays.stampaMatrice(mat3);
	}
}