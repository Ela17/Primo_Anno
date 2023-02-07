import java.util.Scanner;

public class TestVocali {
    public static void main(String[] args) {
        System.out.print("Inserisci una stringa: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(MetodiRicorsivi.trovaCarattere(s, 'a'))
            System.out.println("Numero occorrenze vocale 'a': " + MetodiRicorsivi.contaCaratteri(s, 'a'));
        else 
            System.out.println("La vocale 'a' non è presente.");
        if(MetodiRicorsivi.trovaCarattere(s, 'e'))
            System.out.println("Numero occorrenze vocale 'e': " + MetodiRicorsivi.contaCaratteri(s, 'e'));
        else 
            System.out.println("La vocale 'e' non è presente.");
        if(MetodiRicorsivi.trovaCarattere(s, 'i'))
            System.out.println("Numero occorrenze vocale 'i': " + MetodiRicorsivi.contaCaratteri(s, 'i'));
        else 
            System.out.println("La vocale 'i' non è presente.");
        if(MetodiRicorsivi.trovaCarattere(s, 'o'))
            System.out.println("Numero occorrenze vocale 'o': " + MetodiRicorsivi.contaCaratteri(s, 'o'));
        else 
            System.out.println("La vocale 'o' non è presente.");
        if(MetodiRicorsivi.trovaCarattere(s, 'u'))
            System.out.println("Numero occorrenze vocale 'u': " + MetodiRicorsivi.contaCaratteri(s, 'u'));
        else 
            System.out.println("La vocale 'u' non è presente.");
    }
}
