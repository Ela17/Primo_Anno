class Metodi_dicotomici {
	 
    /***
    Ricerca Dicotomica – versione iterativa
    
    Precondizione: l'array vet è ordinato in ordine crescente 
    Postcondizione: se c presente nell’array vet restituisce la sua posizione, 
    altrimenti restituisce -1
    ***/
    public static int ricerca_it(int[] vet, int c) {
    
            int sx = 0, dx = vet.length - 1, m;
            while (sx < dx) {
                m = (sx + dx) / 2;  // determina la posizione mediana del sottovettore
                if (vet[m] < c) // se c maggiore di quello in posizione mediana
                    sx = m + 1;  // cerca nella meta' di destra
                else if (vet[m] > c) // se c minore di quello in posizione mediana
                    dx = m - 1;  // cerca nella meta' di sinistra
                else // c, se presente, si trova nella posizione mediana dell'array
                    sx = dx = m;  
            }
            if (vet[sx] == c)
                return sx;
            else
                return -1;
        }	// fine metodo ricerca
    
    /***
    Ricerca Dicotomica — versione ricorsiva
    Precondizione: 0 ≤ sx,dx < vet.length, vet ordinato in ordine crescente
    Postcondizione: se c presente in vet in una posizione compresa tra sx e dx restituisce questa posizione, altrimenti restituisce -1
    ***/
    static int ricerca_wrap(int[] vet, int c) {
        return ricerca(vet,c,0,vet.length-1);
        }
        
    static int ricerca(int[] vet, int c, int sx, int dx){
    
            int m,r;
            if (sx < dx) {
                m = (sx + dx) / 2;  // determina la posizione mediana dell'array
                if (vet[m] < c) // se valore cercato maggiore di quello in posizione mediana
                    r = ricerca(vet,c,m+1,dx);  // cerca nella meta' di destra
                else if (vet[m] > c) // se valore cercato minore di quello in posizione mediana
                    r = ricerca(vet,c,sx,m-1);  // cerca nella meta' di sinistra
                else // l'elemento si trova nella posizione mediana dell'array
                    r = m;  
            }
            else
            if (vet[sx] == c)
                r = sx;
            else
                r = -1;
            return r;
    } 
    /***
    Variazioni sul tema della ricerca dicotomica (ricorsiva)
    
    Metodo per determinare il valore minimo presente in un array di interi
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: min(vet,sx,dx) restituisce il minimo valore
                    del sottovettore di vet compreso tra le 
                    posizioni sx e dx
    ***/
    static int min(int[] vet, int sx, int dx){
        int m;
            if (sx+1 < dx) {
                int m1,m2;
                int h = (sx + dx) / 2; 
                m1 = min(vet,sx,h); // m1 minimo del sottovettore tra sx e h
                m2 = min(vet,h+1,dx); // m2 minimo del sottovettore tra h+1 e dx
                if (m1 < m2) 
                    m = m1;
                else 
                    m = m2;	
            }
            else
            if (sx == dx)
                m = vet[sx];
            else
                if (vet[sx] < vet[dx]) 
                    m = vet[sx];
                else 
                    m = vet[dx];		
            return m;
    } 
    
    
    static int filter (int[] vet, int k, int sx, int dx){
    /**
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: filter(vet,k,sx,dx) restituisce il numero di elementi 
         di vet > k nel sottovettore compreso tra le posizioni sx e dx
    */
        if (sx < dx) 
            return filter(vet,k,sx,(sx+dx)/2) + filter(vet,k,(sx+dx)/2 + 1,dx);
        else
            if (vet[sx] > k) 
                return 1;
            else 
                return 0;
        
    }
    
    static boolean filter1 (int[] vet, int k, int sx, int dx){
    /**
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: filter1(vet,k,sx,dx) determina se ci sono elementi 
         di vet > k nel sottovettore compreso tra le posizioni sx e dx
    */
        if (sx < dx) 
            return (filter1(vet,k,sx,(sx+dx)/2) || filter1(vet,k,(sx+dx)/2 + 1,dx));
        else
            if (vet[sx] > k) 
                return true;
            else 
                return false;
        
    }

    /*  filter1 IN FORMA RICORSIVA CONTROVARIANTE:
        Precondizione: i <= vet.length
        Postcondizione: filter1(vet,k,i) determina se ci sono elementi 
                        di vet > k nel sottovettore compreso tra le posizioni i e vet.length-1
    
    static boolean filter1 (int[] vet, int k, int i) {
        if (i < vet.length)
            return (vet[i] > k) || filter1(vet, k, i+1); 
        else 
            return false;       
    }

    */
    
    public static boolean e1(int[][] x) {
        boolean ogni = true;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                ogni = ogni && x[i][j] % 2 != 0;
        return ogni;
    }
    
    static boolean e2(int[][] x) {
        return e2R(x, 0, x.length - 1);
    }
    
    static boolean e2R(int[][] x, int l, int r) {
        if (l < r) {
            int m = (l + r)/2;
            return  e2R(x, 0, m) || e2R(x, m + 1 , r);
        }
         else
            return esiste(x[l]);
    }
    
    static boolean esiste(int[] r) {
        boolean b = false;
        for (int i = 0; i < r.length && !b; i++)
            if (r[i] == 0) b = true;
        return b; 
    }
    
    static boolean filterAll (int[] vet, int k, int sx, int dx){
    /**
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: filterAll(vet,k,sx,dx) determina se tutti gli elementi 
         di vet nel sottovettore compreso tra le posizioni sx e dx sono > k
    */
        if (sx < dx) 
            return (filterAll(vet,k,sx,(sx+dx)/2) && filterAll(vet,k,(sx+dx)/2 + 1,dx));
        else
        if (vet[sx] > k) 
            return true;
        else 
            return false;
        
    }
    
    static boolean filterAll_Dispense(int[] vet, int k) {
         return filterAll_Dispense(vet,k,0,vet.length);
    }
    
    static boolean filterAll_Dispense(int[] vet, int k, int l, int r) {
         if (l < r)
              if (r-l == 1)
                    return vet[l] > k;
              else {
                    int m = (l+r)/2;
                    return (filterAll_Dispense(vet,k,l,m) && filterAll_Dispense(vet,k,m,r));
              }
         else return true;
    }
    
    
    static int constant (int[] vet, int sx, int dx){
    /** 
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: per un vettore di cifre binarie, determina se tutti gli elementi 
         del sottovettore compreso tra le posizioni sx e dx sono uguali restituendo -1 come valore della chiamata ricorsiva quando la condizione non e' soddisfatta per il sottoarray su cui avviene la chiamata, 0 se tutti gli elementi del sottoarray sono 0, 1 se tutti gli elementi del sottoarray
       sono 1
    */
        int x = - 1;
        if (sx < dx) {
            int l = constant(vet,sx,(sx+dx)/2);
            int r = constant(vet,(sx+dx)/2+1,dx);
            if ((l == r) && (r >= 0)) 
                x = l;
            else 
                x = -1; 
        }
        else
            x = vet[sx];
        return x;	
    }
    
    
    static boolean increasing (int[] vet, int sx, int dx){
    /** 
    Precondizione: 0 ≤ sx,dx < vet.length
    Postcondizione: restituisce true se e solo se 
         per ogni i per ogni j (sx ≤ i,j ≤ dx --> vet[i] ≤ vet[j])
    */
        if (sx < dx) {
            boolean l = increasing(vet,sx,(sx+dx)/2);
            boolean r = increasing(vet,(sx+dx)/2+1,dx);
            if (l && r && (vet[(sx+dx)/2] <= vet[(sx+dx)/2+1])) 
                return true;
            else 
                return false; 
        }
        else
            return true;
            
    }
    
    static boolean crescente (int[] vet, int i){
    /** 
    Precondizione: 0 ≤ i < vet.length
    Postcondizione: restituisce true se e solo se 
                per ogni j per ogni k (i ≤ j,k < vet.length --> vet[i] ≤ vet[j])
    */
        if (i < vet.length-1)
            return (vet[i] <= vet[i+1]) && crescente(vet,i+1);
        else
            return true;
    }
    
    public static void main(String [] args) {
        int[] a = {1,2,3,4,5,6,8,9,12,45,67,89};
    int[] b = {1,1,1};
    int[] c = {0,0,0,0,0,0,0};
    int [][] x = {{}};
    System.out.println(e2(x));
    
    /***
    System.out.println(ricerca_it(a,5));
    System.out.println(ricerca_wrap(a,5));
    System.out.println(min(a,0,a.length-1));
    System.out.println(filter(a,5,0,a.length-1));
    System.out.println(filter1(a,5,0,a.length-1));
    System.out.println(filterAll(a,5,0,a.length-1));
    System.out.println(filterAll_Dispense(a,0));
    System.out.println(constant(b,0,b.length-1));
    System.out.println(constant(c,0,c.length-1));
    System.out.println(increasing(a,0,c.length-1));
    System.out.println(crescente(a,0));
    ***/
    }
    
}   // fine classe Metodi_dicotomici