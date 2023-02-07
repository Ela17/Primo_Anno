import java.util.Scanner;

public class LeggiArray{
	
		public static int[] leggiArrayInt(){
			System.out.println("Inserire dei valori");
			return leggiArrayIntRic(0);
		}
		
		public static int[] leggiArrayIntRic(int i){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			if(n == 0) {
				return new int[i];
			}
			else {
				int[] a = leggiArrayIntRic(i+1);
				a[i] = n;
				return a;
			}
		}
		
		public static void stampaArrayInt(int[] intArr) {
			if(intArr == null || intArr.length == 0)
				System.out.println();
			else
				stampaArrayIntRic(intArr, 0);
		}
		
		public static void stampaArrayIntRic(int[] intArr, int i) {
			if(i == intArr.length)
				System.out.println();
			else {
				System.out.print(intArr[i] + " ");
				stampaArrayIntRic(intArr, i+1);
			}
		}
		
		public static void main(String[] args){
			int[] array = leggiArrayInt();
			stampaArrayInt(array);
		}
}