/**
Scrivere un programma che legge da stdin una sequenza di interi positivi terminata da 0 e ne scrive su stdout la media
**/

class Media {
public static void main (String[] args){
// dichiarazioni di variabili
int x;  
int c=0;  //counter
int s=0;  //sommatore
do {
    System.out.println("Inserire un numero intero positivo oppure 0 per terminare: ");
    x = SIn.readLineInt();
    s = s + x;
    if(x != 0) c++;
    } while (x != 0);
if (c != 0) System.out.println("Media =  " + s/c);
}
}

/**
Scrivere un programma che legge un intero da stdin e scrive su stdout tutti i suoi divisori
*/

class Divisori {
public static void main (String[] args){
System.out.print("Scrivi un intero positivo: ");
int x = SIn.readLineInt();
int d = x;
while (d>0) {
    if(x%d == 0) {
        System.out.println(d);
    }
    d=d-1;
}
}
}

/**
Programma per determinare se tutti i numeri interi positivi letti da stdin (la sequenza è terminata da 0) sono pari
*/

class TuttiPari {
public static void main (String[] args){
int x; // variabile di lettura
boolean pari =  true;
System.out.println("Inserire interi positivi oppure 0 per terminare: ");
do {
    x=SIn.readLineInt();
    if(x%2 != 0)    pari=false;
} while (x!=0);
System.out.println(pari);
}
}

/**
Esercizio
Determinare se una sequenza di numeri interi positivi scritta su stdin (uno per riga) e terminata da 0 contiene almeno un numero pari
*/

class AlmenoUnoPari {
    public static void main (String[] args){
    int x; // variabile di lettura
    boolean pari =  false;
    System.out.println("Inserire interi positivi oppure 0 per terminare: ");
    do {
        x=SIn.readLineInt();
        if(x%2 == 0 && x!=0)    pari=true;
    } while (x!=0);
    System.out.println(pari);
    }
    }
