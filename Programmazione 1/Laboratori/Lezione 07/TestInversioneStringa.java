import java.util.Scanner;

public class TestInversioneStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String s = sc.nextLine();
        System.out.print("stringaInversa(\"" + s + "\")==\"" + MetodiRicorsivi.stringaInversa(s) + "\"");
    }
}
