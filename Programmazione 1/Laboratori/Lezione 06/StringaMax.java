import java.util.Scanner;

public class StringaMax {

	public static String maxLengthStr (String s1, String s2) {
		if(s1.length() > s2.length())
			return s1;
		return s2;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, maxs = "";
		int cnt = 0;
		boolean continua = true;
		
		System.out.println("Inserire delle stringhe. Due volte Invio per terminare : ");
		
		do {
			s = sc.nextLine();
			if (s.length() == 0) 
				continua = false;
			else {
				cnt++;
				maxs = maxLengthStr(s, maxs);
			}			
		} while (continua == true);	

		if (cnt > 0)
			System.out.println("La stringa di lunghezza massima è '" + maxs + "'");
		else 
			System.out.println("Non hai inserito stringhe valide.");
	}	
	
}