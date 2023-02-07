import java.util.Scanner;

public class CambiaMoneteRicorsivo {

    public static void cambioTaglioRic(int somma, int indiceTaglio) {
        final int[] tagliMonete = {50, 20, 10, 5, 2, 1};

        if(indiceTaglio>=tagliMonete.length)
            return;

        int x = somma / tagliMonete[indiceTaglio];
        if(x > 0)
            System.out.println(x + " da " + tagliMonete[indiceTaglio] + " cent");
        
        cambioTaglioRic(somma - x*tagliMonete[indiceTaglio], indiceTaglio + 1);
    }


    public static void main(String[] args) {
        int somma;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Inserisci una somma: ");
            somma = sc.nextInt();
            if(somma <= 0)
                System.out.println("Valore non valido. Riprova.");
        } while(somma <= 0);
            
        cambioTaglioRic(somma, 0);
    }
}
