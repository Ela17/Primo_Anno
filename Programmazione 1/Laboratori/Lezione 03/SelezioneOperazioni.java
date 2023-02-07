public class SelezioneOperazioni {
    public static void main(String[] args) {
        int a, b, c;
        int op;
        double m;

        System.out.println("Inserire tre interi: ");
        a = SIn.readInt();
        b = SIn.readInt();
        c = SIn.readInt();

        System.out.println("Che operazioe vuoi effettuare?");
        System.out.println("1 - somma \n2 - moltiplicazione\n3 - media");
        op = SIn.readInt();
        if(op == 1) {
            a = a + b + c;
            System.out.println("la somma e' " + a);
        }
        else if(op == 2) {
            a = a * b * c;
            System.out.println("il prodotto e' " + a);
        }
        else if(op == 3) {
            m = a+b+c;
            m = m / 3;
            System.out.println("la media e' " + m);
        }
        else System.out.println("Il valore inserito non è tra le scelte.");
    
    }
}
