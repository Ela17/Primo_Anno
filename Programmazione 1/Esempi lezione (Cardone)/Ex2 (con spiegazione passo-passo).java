class Ex2 {

    static int F(int n){
        if (n == 0) return 0;
        else return F(n - 1) + n;
    }
    
    public static void main(String[] args){
        System.out.println(F(5));
    }
}

/* SPIEGAZIONE

Calcolo F(n):   se n == 0 allora 0, altrimenti F(n - 1) + n

prendiamo ad esempio n = 5:

F(5) = F(4) + 5 // prendo il secondo caso perchè n!=0
quanto vale F(3) ?
F(4) = F(3) + 4
quanto vale F(3) ?
F(3) = F(2) + 3
quanto vale F(2) ?
F(2) = F(1) + 2 
quanto vale F(1) ?
F(1) = F(0) + 1
quanto vale F(0) ?
F(0) == 0 !!!

Quindi so quanto vale F(1):
    infatti F(1) = F(0) + 1 = 0 + 1 = 1
Ora posso calcolare F(2)
    infatti F(2) = F(1) + 2 = 1 + 2 = 3
Quindi conosco F(3):
    infatti F(3) = F(2) + 3 = (F(1) + 2) + 3 = 3 + 3 = 6
Poi trovo F(4):
    infatti F(4) = F(3) + 4 = (F(2) + 3) + 4 = F(F(F(1) + 2) + 3) + 4 = 6 + 4 = 10
Infine ottengo F(5):
    infatti F(5) = F(4) + 5 = (F(3) + 4) + 5 = F(F(F(F(1) + 2) + 3) + 4) + 5 = 10 + 5 = 15
    
*/