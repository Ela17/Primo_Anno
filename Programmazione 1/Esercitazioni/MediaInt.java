public class MediaInt {
    public static double media (int a, int b) {
        double s = 0;
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            s = s + i;
            cnt++;
        }
        return (double)(s)/cnt;
    }

    public static void main(String[] args) {
        System.out.print("Inserire un intero: ");
        int a = SIn.readInt();
        int b;

        do {
            System.out.print("Inserire un altro intero: ");
            b = SIn.readInt();

            if(b<a)
                System.out.println("Intero non valido. Riprova.");

        }while(b<a);
        
        System.out.println("La media aritmetica degli interi nell'intervallo [" + a + ", " + b + "] vale: " + media(a, b));
    }
}
