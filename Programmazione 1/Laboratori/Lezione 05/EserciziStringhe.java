import java.util.Scanner;

public class EserciziStringhe {
    
    public static boolean testVocale (char c) {
        String vocali = "AEIOUaeiou";

        for(int i = 0; i < vocali.length(); i++)
            if (c == vocali.charAt(i))
                return true;
        return false;
    }

    public static boolean contieneVocali (String s) {
        for (int i = 0; i<s.length(); i++)
            if(testVocale(s.charAt(i)))
                return true;
        return false;
    }

    public static void stampaVocali() {
        System.out.print("Inserire una stringa: ");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        if(contieneVocali(in)) {
            System.out.println("La stringa '" + in + "' contiene le seguenti vocali:");
            for (int i = 0; i < in.length(); i++)
                if(testVocale(in.charAt(i)))
                    System.out.print(in.charAt(i) + " ");
        }
        else 
            System.out.println("La stringa '" + in + "' non contiene vocali.");
    }

    public static void main(String[] args) {
        stampaVocali();
    }
    
}
