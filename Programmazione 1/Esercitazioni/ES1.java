public class ES1 {
    public static void triangoloRettangolo(int n) {
        // stampa triangolo rettangolo di base = altezza = n
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
    }

    public static void main(String[] args) {
        triangoloRettangolo(6);
    }
}