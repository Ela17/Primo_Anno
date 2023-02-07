public class Contrario {
    public static void stampaAlContrario(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Inserire una stringa:");
        String s = SIn.readLine();
        stampaAlContrario(s);
    }
}
