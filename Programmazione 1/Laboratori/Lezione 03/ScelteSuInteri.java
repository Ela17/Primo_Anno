public class ScelteSuInteri {
    public static void main(String[] args) {
        int x;

        System.out.println("Inserire un intero: ");
        x = SIn.readInt();
        
        if(x%2==0){
            if(x%4==0)
                System.out.println("L'intero e' multiplo di 4");
            else
                System.out.println("L'intero non e' multiplo di 4");
        }
        else{
            if(x%3==0)
                System.out.println("L'intero e' multiplo di 3");
            else
                System.out.println("L'intero non e' multiplo di 3");
        }
    }
}
