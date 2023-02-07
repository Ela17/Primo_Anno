class Potenza{
    /*
Dati in ingresso: N intero
Dati in uscita: e >= 0
Condizione di ingresso: N >= 0
Condizione di uscita: e = 2^N

La funzione 2^x ha come grafo:

(0,1)
(1,2)
(2,4)
(3,8)...

    */
public static void main (String[] args){
	int N = SavitchIn.readLineInt();
   int x = 0;
   int e = 1;
	while (x < N)   { // invariante: e = 2^x
/***
Per dimostrare l'invarianza, bisogna dimostrare che 
   per ogni k >= 0, dopo k iterazioni del corpo del ciclo, e = 2^x
La dimostrazione si fa per induzione su k:
Base: k = 0
Passo induttivo: preso k a piacere, si assuma che 
   dopo k iterazioni del corpo del ciclo e = 2^x  (ipotesi induttiva)
Si deve dimostrare che 
   dopo una ulteriore iterazione del corpo del ciclo, cioè
   dopo k + 1 iterazioni del corpo del ciclo e = 2^x
ESERCIZIO: per la lezione di Mercoledì 12
**/
		x = x + 1;
      e = 2 * e;  
	}
	System.out.println("2 elevato alla " + N + " è = " + e);
   } // all'uscita x = N, ma per l'invariante e = 2^x = 2^N
}