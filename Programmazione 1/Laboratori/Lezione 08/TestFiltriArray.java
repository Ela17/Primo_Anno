public class TestFiltriArray {
	public static void main(String[] args) {
		int[] array = MetodiSuArray.initArrayInt();
		int[] minore = MetodiSuArray.filtroMinoriDi(array, 5);
		MetodiSuArray.stampaArray(minore);
		int[] dispari = MetodiSuArray.filtroIntervalloDisp(array, 3, 15);
		MetodiSuArray.stampaArray(dispari);
		
		boolean[] b = MetodiSuArray.trasduttore(array, 5);
		MetodiSuArray.stampaArrayBoolean(b);
	}	
}	