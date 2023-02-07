public class ES2 {
    public static void stampa(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++)
                System.out.print(j);
            System.out.print("   ");
            for(int j = n-i; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stampa(6);
    }
}
