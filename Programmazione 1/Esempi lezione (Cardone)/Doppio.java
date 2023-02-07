class Doppio {

	static int doppio(int n){	/* condizione iniziale: n >= 0

	  condizione di uscita: restituisce 2 * n

	

	La funzione d che raddoppia un numero naturale ha la seguente definizione ricorsiva:

		

		doppio(0) = 0 	infatti restituisce 2 * 0 == 0, vero per definizione del metodo

		doppio(n) = 2 + doppio(n - 1) 

	

	Per ogni 	n >= 0 	doppio(n) = 2 * n  

	Per induzione su n naturale si dimostra chedoppio(n) restituisce 2 * n

	- base: n == 0:	infatti il doppio di 0 è 0.

	- passo induttivo: n > 0

			

			bisogna dimostrare che per ogni	n > 0	vale l'implicazione:

	

			SE doppio(n - 1) restituisce 2 * n ALLORA doppio(n) restituisce 2 * n

	

	Assumiamo che	doppio(n - 1) 	restituisca	2 * (n - 1) : questa è l'ipotesi induttiva;

	bisogna dimostrare che	doppio(n)	restituisce	2 * n. 

				

				MA 	doppio(n)  == doppio (n-1) + 2

												== 2 * n - 2 + 2

												== 2 * n

	Per un'applicazione del principio di induzione, abbiamo la certezza.

	*/

	

		if (n == 0) 

			return 0;

		else

			return doppio (n - 1) + 2;

	}

	

	

	public static void main (String[] args) {

		System.out.println(doppio(15));

	}

}	
