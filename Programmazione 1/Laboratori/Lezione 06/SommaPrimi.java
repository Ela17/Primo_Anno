import java.util.Scanner;

public class SommaPrimi {

    public static boolean isPrime (int n, int i) {
        if(i <= 1)
            return true;
        
        return n%i != 0 && isPrime(n, i - 1);
    }

    public static int sommaPrimiRic (int n, int cnt) {
        if(cnt == 0)
            return 0;
        if(isPrime(n, n - 1))
            return n + sommaPrimiRic(n + 1, cnt - 1);
        return sommaPrimiRic (n + 1, cnt);
    }

    public static int sommaPrimi (int n) {
        return sommaPrimiRic(2, n); // primo num primo == 2
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire un intero positivo: ");
        int N = sc.nextInt();

        System.out.println("La somma dei primi " + N + " numeri primi è: " + sommaPrimi(N));
    }
    
}
