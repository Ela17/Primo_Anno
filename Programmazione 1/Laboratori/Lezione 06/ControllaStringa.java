public class ControllaStringa {

    public static boolean tutteCifreRic (String s, int n) {
        //ritorna true se il char di indice n è una cifra 0-9
        if (s.charAt(n) >= '0' && s.charAt(n) <= '9'){
            if (n == s.length()-1)
                return true;
            return tutteCifreRic(s, n+1);
        }
        return false;
    }

    public static boolean tutteCifre (String s) {
        //ritorna true se tutti i caratteri sono cifre 0-9      
        return tutteCifreRic(s, 0);
    }

    public static void main (String[] args) {
        String s = "45168";
        System.out.println(tutteCifre(s)); // expected true
        s = "45k68";
        System.out.println(tutteCifre(s)); // expected false
    }

}
