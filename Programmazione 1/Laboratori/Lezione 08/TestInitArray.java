public class TestInitArray {
    public static void main(String[] args) {
		/* 	ESERCIZIO 1	*/
        int[] array = MetodiSuArray.initArrayInt();
        MetodiSuArray.stampaArray(array);
		
		/*	ESERCIZIO 2	*/
		int[] copia = MetodiSuArray.clonaArray(array);
		System.out.print("Copia del precedente array: ");
		MetodiSuArray.stampaArray(copia);
    }
}
