class RicorsioneArrayControvariante {
    static void stampa (boolean[] x) {
        for(int i = 0; i < x.length; i++){
            if(i==x.length-1)
                System.out.print(x[i]);
            else 
                System.out.print(x[i] + " && ");
        }
    }

    
    static boolean congiunzione_cov(boolean[] a, int i) {  // a = array di boolean
        // calcola con ricorsione covariante la congiunzione di tutti
        // gli elementi in a
        if(i >= 0)
        return (a[i]) ? congiunzione_cov(a, i-1) : false;   // espressione booleana "compatta"
                // vuol dire: if(a[i]==true)    
                //              return congiunzione_cov(a, i-1);
                //            else 
                //              return false;
        else
            return true;
            
    }

    static boolean congiunzione_cov_wrap(boolean[] a) {
        return congiunzione_cov(a, a.length);
    }

    public static void main(String[] args) {        
        boolean[] b = {true, false, 3 < 4, true && (3 < 4), true || false};
        stampa(b);
        System.out.println(" = " + congiunzione_wrap(b));
    }
}