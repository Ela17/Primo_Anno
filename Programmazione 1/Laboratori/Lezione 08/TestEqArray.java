public class TestEqArray {
	public static void main(String[] args) {
		int[] 	a1 = {0, 2, 3, 5, -4, 9, 10},
				a2 = {6, 4, 4, 8, 12, 4, 22},
				a3 = {10, 7, 5, 99, 31, 20},
				a4 = {5, 7, 8, 9, 12},
				a5 = MetodiSuArray.clonaArray(a2),
				a6 = null;
				
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a1,a2));
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a4,a2));
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a5,a2));
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a3,a3));
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a2,a6));
		System.out.println(MetodiSuArray.eqArrayRic_wrap(a6,a6));
		System.out.println();
		System.out.println(MetodiSuArray.tuttiPariMaggioriDi_Ric_wrap(a1,0));
		System.out.println(MetodiSuArray.tuttiPariMaggioriDi_Ric_wrap(a2,2));
		System.out.println(MetodiSuArray.tuttiPariMaggioriDi_Ric_wrap(a2,8));
		System.out.println(MetodiSuArray.tuttiPariMaggioriDi_Ric_wrap(a4,-5));
		System.out.println(MetodiSuArray.tuttiPariMaggioriDi_Ric_wrap(a6,3));
	}
}