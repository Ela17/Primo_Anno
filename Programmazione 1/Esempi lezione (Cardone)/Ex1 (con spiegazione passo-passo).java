class Ex1 {

    static int F(int n) {
        if (n == 0) return 0;
        else return F(n - 1) + 1;
    }

    public static void main(String[] args){
        System.out.println(F(4));
    }
}
/* SPIEGAZIONE

Calcolo F(n):   se n == 0 allora 0, altrimenti F(n - 1) + 1

prendiamo ad esempio n = 4:
F(4) = F(3) + 1 // prendo il secondo caso perchè n!=0
quanto vale F(3) ?
F(3) = F(2) + 1
quanto vale F(2) ?
F(2) = F(1) + 1
quanto vale F(1) ?
F(1) = F(0) + 1 
quanto vale F(0) ?
F(0) == 0 !!!

Quindi so quanto vale F(1):
    infatti F(1) = 0 + 1 = 1
Ora posso calcolare F(2)
    infatti F(2) = F(1) + 1 = 1 + 1 = 2
Quindi conosco F(3):
    infatti F(3) = F(2) + 1 = (F(1) + 1) + 1 = 2 + 1 = 3
Infine ottengo F(4):
    infatti F(4) = F(3) + 1 = (F(2) + 1) + 1 = F(F(F(1) + 1) + 1) + 1 = 3 + 1 = 4
    
*/