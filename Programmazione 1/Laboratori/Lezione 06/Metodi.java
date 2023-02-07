import java.util.Scanner;

public class Metodi {

	public static boolean palindroma (String s) {
		int N = s.length();
		boolean pal = true;
		
		for (int i = 0; i < N/2 && pal == true; i++) {
			if (s.charAt(i) != s.charAt(N-1-i))
				pal = false;
		}
		return pal;
	}
	
	public static boolean elementiComuni (String s1, String s2) {
		boolean diversi = true;
		int N1 = s1.length(), N2 = s2.length();
		
		for(int i = 0; i < N1 && diversi == true; i++) {
			for (int j = 0; j < N2  && diversi == true; j++)
				if (s1.charAt(i) == s2.charAt(j))
					diversi = false;
		}
		return diversi;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire una stringa: ");
		String in = sc.nextLine();
		
		if (palindroma(in))
			System.out.println("La stringa inserita è palindroma.");
		else 
			System.out.println("La stringa non è palindroma");
		
		System.out.print("Inserire un'altra stringa: ");
		String str = sc.nextLine();
		
		if (elementiComuni(in, str))
			System.out.println("Nessun carattere della prima stringa compare anche nella seconda.");
		else 
			System.out.println("Almeno un carattere della prima stringa compare anche nella seconda.");
	}	

}