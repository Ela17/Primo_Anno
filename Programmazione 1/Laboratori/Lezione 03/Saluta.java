public class Saluta {
    public static void main(String[] args) {
        int x;
        
        System.out.println("Che ore sono? (formato hh, senza min)");
        x = SIn.readInt();
        if(x<12 && x>=6) System.out.println("Buon giorno");
        if(x>=12 && x<=17) System.out.println("Buon pomeriggio");
        if(x>17 && x<=21) System.out.println("Buona sera");
        if(x>21 || x<6) System.out.println("Buona notte");
    }   
}
