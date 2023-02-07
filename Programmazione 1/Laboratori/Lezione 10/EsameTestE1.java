
public class EsameTestE1 {
	
	public static void main(String[] args) {
		int[] a0 = null;
		int[] b0 = null;
		int[] a1 = {1};
		int[] b1 = {1};
	    System.out.println(Esame.e1(a0,b0)==false);
	    System.out.println(Esame.e1(a0,b1)==false);
	    System.out.println(Esame.e1(a1,b0)==false);
		
	    int[] a2 = {27,8};
	    int[] b2 = {3,5,4,5,2,9};
	    System.out.println(Esame.e1(a2,b2)==true);

	    int[] a3 = {27,4,17};
	    int[] b3 = {3,5,8,5,2,9};
	    System.out.println(Esame.e1(a3,b3)==false);

	    int[] a4 = {17,19};
	    int[] b4 = {19,17,17,19};
	    System.out.println(Esame.e1(a4,b4)==false);

	    int[] a5 = {17,19};
	    int[] b5 = {19,17,17,19,1};
	    System.out.println(Esame.e1(a5,b5)==true);
	}
}
