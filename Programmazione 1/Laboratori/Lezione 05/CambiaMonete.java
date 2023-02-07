import java.util.Scanner;
public class CambiaMonete {

    public static int cambioTaglio (int s, int t) {
        int x = 0, aux = s - t;
        
        while(aux >= 0) {
            x++;
            aux = aux - t;
        }
        System.out.println(x + " da " + t + " cent");
        return s - (x * t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tagli = {1, 2, 5, 10, 20, 50}; 
        int somma, resto, i = tagli.length - 1;
        boolean trovato;
        
        System.out.print("Inserire la cifra: ");
        somma = sc.nextInt();

        do {
            trovato = false;
            while(i >= 0 && !trovato) {
                if(somma >= tagli[i]) 
                    trovato = true;
                i--;   
            }           
            resto = cambioTaglio(somma, tagli[++i]);
            somma = resto; 
        } while(somma>0);       
    }

}
