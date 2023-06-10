import java.util.Scanner;

public class Ciao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, ciao = "ciao";
        int i = 1;
        boolean uguali = true;

        do {
            System.out.print("Inserisci una stringa: ");
            s = sc.next();
            if (!s.equals(ciao))
                uguali = false;
            i++;
        } while (i <= 5);
        System.out.println(uguali);
    }
    
}
