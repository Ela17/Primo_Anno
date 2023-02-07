import java.util.Scanner;

public class PositivoNegativo {
    public static void positivoNegativo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire una sequenza di interi. 0 per terminare.");
        int n;
        boolean pos = false, ok = false;

        do {
            n = sc.nextInt();
            if(n > 0)
                pos = true; // ho inserito numero positivo
            if(n < 0) { 
                if(pos)
                    ok = true;  // il numero negativo che ho inserito segue uno positivo
                else
                    pos = false;
            }
        } while (n != 0);

        if(ok)
            System.out.println("OK");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        positivoNegativo();
    }
}
