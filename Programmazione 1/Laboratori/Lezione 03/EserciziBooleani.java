public class EserciziBooleani {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        // a) dati due interi, stampi true se il primo intero 
        //    è multiplo del secondo, false altrimenti;
        boolean x = (a%b==0);
        System.out.println(x);

        // b) dato un intero (un voto), stampi true se tale 
        //    intero è compreso fra 1 e 30 (inclusi), false altrimenti;
        x = (a>=1 && a<=30);
        System.out.println(x);

        boolean b1 = false;
        boolean b2 = true;
        // c) dati due booleani b1 e b2, stampi a video il booleano 
        //    false, se b1 e b2 sono entrambi veri, true altrimenti;
        x = !(b1 && b2);
        System.out.println(x);

        // d) dati due interi, stampi a video il massimo; se sono 
        //    uguali stampi a video "I due valori sono uguali".
        if(a>=b){
            if(a==b) System.out.println("I due valori sono uguali");
            else System.out.println("max " + a);
        }
        else System.out.println("max " + b);

        int x1 = 3;
        int x2 = 1;
        int x3 = 2;
        // e) dati tre interi, stampi a video il massimo (si usi una 
        //    variabile di supporto max); 
        int max=0;
        if(x1>x2){
            if(x1>x3) max=x1;
            else max=x3;
        } else {
            if(x2>x3) max=x2;
            else max=x3;
        }
        System.out.println("max " + max);

        // f) dati tre interi, stampi a video true se questi sono 
        //    ordinati in modo crescente
        boolean ok;
        if(x1<x2 && x2<x3)
            ok=true;
        else ok=false;

        /* oppure
        boolean ok = (x1<x2 && x2<x3);
        senza utilizzo if
         */ 
        
        System.out.println(ok);
    }
}
