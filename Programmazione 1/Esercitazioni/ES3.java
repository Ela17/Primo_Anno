public class ES3 {
    public static void fibonacci() {
        int n1 = 0, n2 = 1;
        System.out.print((n2) + " ");
        for (int i = 0; i < 30; i++) {  
            n2 = n2 + n1;  
            n1 = n2 - n1;  
            System.out.print(n2 + " ");
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}
