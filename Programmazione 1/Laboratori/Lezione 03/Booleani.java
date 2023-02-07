
public class Booleani {

    public static void main(String[] args) {
        boolean vero = true;
        System.out.println("vero: " + vero);
        boolean falso = false;
        System.out.println("falso: " + falso);

        boolean negazione1 = !vero;
        System.out.println("negazione1: " + negazione1);
        boolean negazione2 = !falso;
        System.out.println("negazione2: " + negazione2);

        boolean congiunzione1 = vero && falso;
        System.out.println("congiunzione1: " + congiunzione1);
        boolean congiunzione2 = vero && vero;
        System.out.println("congiunzione2: " + congiunzione2);

        boolean disgiunzione1 = vero || falso;
        System.out.println("disgiunzione1: " + disgiunzione1);
        boolean disgiunzione2 = falso || falso;
        System.out.println("disgiunzione2: " + disgiunzione2);

        boolean b1 = 2 == 2; // true
        boolean b2 = 2 >= 2; // true
        boolean b3 = 2 > 3;  // false
        boolean b4 = 2 != 2; // false
        boolean b5 = 2 == 3; // false
        boolean b6 = 2 <= 3; // true
        boolean b7 = 3 < 3;  // false
        boolean b8 = 2 != 3; // true

        // De Morgan
        boolean dM1 = !(b1 && b4) == (!b1 || !b4);
        System.out.println("dM1: " + dM1);
        boolean dM2 = (b1 && b4) == !(!b1 || !b4);
        System.out.println("dM2: " + dM2);

        /* Massimo tra due variabili usando max tale che:
         * max == false se x <  y
         * max == true  se x >= y
         */
        int x = 8;
        int y = 5;
        boolean max = (x >= y);
        System.out.println("max prima soluzione: " + max);

        // equivalente alla seguente (pessima) soluzione:
        if (x >= y) {
            max = true;
        } else {
            max = false;
        }
        System.out.println("max seconda soluzione: " + max);

        // Lazyness && and ||
        boolean b9 = false && (10 / 0) == 1; // invertire i congiunti?
        //boolean b9 = (10 / 0) == 1 && false; // invertire i congiunti?    // dà errore
        System.out.println("b9: " + b9);
        boolean b10 = true || (10 / 0) == 1; // invertire i disgiunti?
        //boolean b10 = (10 / 0) == 1 || true; // invertire i disgiunti?    // dà errore
        System.out.println("b10: " + b10);
    }
}
