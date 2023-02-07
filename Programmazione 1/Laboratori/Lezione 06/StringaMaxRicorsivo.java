import java.util.Scanner;

public class StringaMaxRicorsivo {

    public static String maxStr () {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
		if (s.length() == 0)
	        return "";
        
        String maxs = maxStr();
        if (s.length() > maxs.length())
            return s;
        
		return maxs;
	}
	
	public static void main (String[] args) {
		String maxs = "";
		int cnt = 0;
		boolean continua = true;
		
		System.out.println("Inserire delle stringhe. Due volte Invio per terminare : ");
		
		maxs = maxStr();
        if (maxs.length() != 0)
			System.out.println("La stringa di lunghezza massima è '" + maxs + "'");
		else 
			System.out.println("Non hai inserito stringhe valide.");
	}	
	
}
