public class NumeriPrimi {
    
    public static boolean verificaPrimalita (int n) {
        boolean primo = true;

        for (int i=2; i<n; i++) 
            if (n%i == 0)
                primo = false;
        
        return primo;
    }

    public static void main (String[] args) {
        int n; 

        for(n = 1; n <= 100; n++)
            if(verificaPrimalita(n) == true)
                System.out.println(n);
    }
    
}
