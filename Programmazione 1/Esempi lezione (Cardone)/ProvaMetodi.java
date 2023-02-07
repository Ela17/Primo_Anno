class ProvaMetodi {
	
	
	static int leggiDim() {
		int n = SIn.readLineInt();
		return n;
	}
	
	static void generaRiga(int r, int d) {
		for (int c = 1; c <= d; c++) 
			System.out.print(r * c + "\t");
		System.out.println();
	}
	
	
	public static void main (String[] args) {
		int d = leggiDim();
		for (int r = 1; r <= 10; r++)
			generaRiga(r,d);
	
	}
}