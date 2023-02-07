import java.util.Scanner;

public class ConvertiStringhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String s = sc.nextLine();
        System.out.println("Conversione:");
        System.out.println(MetodiRicorsivi.conversioneCaratteri(s));
    }
}
