public class EmersioneMassimo {
    public static void main(String[] args) {
        int x=8, y=17, z=2, w=1, tmp;

        // confronto prima z con ogni altro valore in modo che siano tutti minori o uguali di z
        if(w>z){
            System.out.println("Prima: w>z \tinfatti z=" + z + "\tw=" + w);
            tmp=z;
            z=w;
            w=tmp;
            System.out.println("Dopo: w<=z \tinfatti z=" + z + "\tw=" + w);
        }
        if(y>z){
            System.out.println("Prima: y>z \tinfatti z=" + z + "\ty=" + y);
            tmp=z;
            z=y;
            y=tmp;
            System.out.println("Dopo: y<=z \tinfatti z=" + z + "\ty=" + y);
        }
        if(x>z){
            System.out.println("Prima: x>z \tinfatti z=" + z + "\tx=" + x);
            tmp=z;
            z=x;
            x=tmp;
            System.out.println("Dopo: x<=z \tinfatti z=" + z + "\tx=" + x);
        }

        // confronto w con ogni altro valore (tranne z) in modo che siano tutti minori o uguali di w
        // non ripeto il controllo con z perchè ho già verificato che z>=w
        System.out.println();   // lascio una riga vuota (solo per chiarezza di lettura)
        if(y>w){
            System.out.println("Prima: y>w \tinfatti w=" + w + "\ty=" + y);
            tmp=w;
            w=y;
            y=tmp;
            System.out.println("Dopo: y<=w \tinfatti w=" + w + "\ty=" + y);
        }
        if(x>w){
            System.out.println("Prima: x>w \tinfatti w=" + w + "\tx=" + x);
            tmp=w;
            w=x;
            x=tmp;
            System.out.println("Dopo: x<=w \tinfatti w=" + w + "\tx=" + x);
        }

        // confronto y con x (unico controllo rimasto) in modo che sia x<=y
        // non ripeto il controllo con z e w perchè ho già verificato che z>=w>=y
        System.out.println();
        if(x>y){
            System.out.println("Prima: x>y \tinfatti y=" + y + "\tx=" + x);
            tmp=y;
            y=x;
            x=tmp;
            System.out.println("Dopo: x<=y \tinfatti y=" + y + "\tx=" + x);
        }
        System.out.println("\n" + z + " >= " + w + " >= " + y + " >= " + x);
    }
}
