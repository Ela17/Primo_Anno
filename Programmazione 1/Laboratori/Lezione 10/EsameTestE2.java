
public class EsameTestE2 {

		public static void main(String[] args) {
		int[] a = null;
	    System.out.println(Esame.e2(a)==0);
  	    int[] n1 = {-1};
	    System.out.println(Esame.e2(n1)==0);
  	    int[] n2 = {-2, -1};
	    System.out.println(Esame.e2(n2)==-2);
  	    int[] n3 = {-3, -2, -1};
	    System.out.println(Esame.e2(n3)==-5);
  	    int[] p1 = { 1};
	    System.out.println(Esame.e2(p1)==0);
  	    int[] p2 = {1, 2};
	    System.out.println(Esame.e2(p2)==2);
  	    int[] p3 = {1, 2, 3};
	    System.out.println(Esame.e2(p3)==5);
  	    int[] a3 = {-2, 1, 3};
	    System.out.println(Esame.e2(a3)==1);
	}
}
