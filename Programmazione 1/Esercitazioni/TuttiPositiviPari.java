import java.util.Scanner;

public class TuttiPositiviPari {
    public static void tuttiPari() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire una sequenza di interi. 0 per terminare.");
        int n;
        boolean pari = true;

        do {
            n = sc.nextInt();
            if(n > 0 && n%2 != 0)
                pari = false;
        }while (n > 0);

        if(pari)
            System.out.println("Tutti positivi e pari");
        else
        System.out.println("NO");
    }

    public static void main(String[] args) {
        tuttiPari();
    }
}
