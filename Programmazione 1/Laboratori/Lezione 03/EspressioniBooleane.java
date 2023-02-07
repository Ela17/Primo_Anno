/*
Valutare le seguenti espressioni booleane (a mente o su carta)

3>5 || 10 == 7+3                        T
3 != 5 && (6 < 2 || 5+2 == 10 - 3)      T
3 < 5 < 7                               x
3 < 5 && 5 < 7                          T
3 < 5 && 7 < 5                          F
true && false                           F
true && 5 < 7                           T
false || 5 < 10                         T


In seguito, completare il codice della classe EspressioniBooleane, 
in modo da valutare in Java le espressioni elencate qui sopra.
Alcune espressioni sono scorrette e causeranno la
generazione di errori di compilazione. Perché e cosa fare per rimediare?
*/

public class EspressioniBooleane {

    public static void main(String[] args) {
        System.out.println("3>5 || 10 == 7+3 is " + (3 > 5 || 10 == 7 + 3));
        System.out.println("3 != 5 && (6 < 2 || 5+2 == 10 - 3) is " + (3 != 5 && (6 < 2 || 5+2 == 10 - 3)));
        System.out.println("3 < 5 && 5 < 7 is " + (3 < 5 && 5 < 7 ));
        System.out.println("3 < 5 && 7 < 5 is " + (3 < 5 && 7 < 5 ));
        System.out.println("true && false is " + (true && false));
        System.out.println("true && 5 < 7 is " + (true && 5 < 7));
        System.out.println("false || 5 < 10 is " + (false || 5 < 10));
        // completare il codice della classe
    }

}
