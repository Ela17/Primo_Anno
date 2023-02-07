class Ripetizione {
/***
ISTRUZIONE FOR
for (contatore e inizializzazione; condizione; modifica contatore) {
	corpo del for
}
***
	
	public static void main (String[] args){
		int r, c;
		for (r = 1; r <= 10; r++) {
			for (c = 1; c <= 10; c++)
				System.out.print(r * c + "\t");
			System.out.println();
		}
	}
	
	// TRASFORMO IL PRIMO FOR IN UN WHILE

	public static void main (String[] args){
		int r = 1;
		while (r <= 10) {
			*ISTRUZIONI*
			r++;
		}
	}
***/

	public static void main (String[] args){
		int c = 1;
		for (int p = 1; p <= 5 ; p++)	// per generare le prime componenti delle coppie
			for (int s = 1; s <=5; s++)	// per generare tutte le possibili seconde componenti
				System.out.println("(" + c++ + ")\t" + p + "   " + s);
					
	}
	
}