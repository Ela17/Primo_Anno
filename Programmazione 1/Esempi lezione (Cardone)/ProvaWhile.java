class ProvaWhile {
	public static void main (String[] args) {
		//	disegna su stout la tavola pitagorica 10 x 10
		int r = 1;
		int c;
		//	per ogni valore r che va da 1 a 10
		while (r <= 10) {
			//	generare i 10 valori della riga r
			c = 1;
			while (c <= 10) { // genera la riga r
				System.out.print(r * c + "\t");
				c++;
			}
			System.out.println();
			r++;
		}
	
	
	}
}