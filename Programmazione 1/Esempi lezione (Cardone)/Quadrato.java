public class Quadrato {

	public static int quadrato (int n) {		/**

		Condizione di ingresso: n >= 0

		Condizione di uscita: quadrato(n) restituisce n * n = n^2

		**/

		if(n == 0)

			// caso base

			return 0;

		else 

			return quadrato (n - 1) + 2 * n - 1;

			/** passo ricorsivo: il valore di n^2 come dipende dal valore di (n-1)^2 ?

				 								n^2 = (n - 1)^2 + 2*(n - 1) + 1

													  	  ^^^^^^^^

														  calcolato nella ricorsione

			**/

	}

	

	public static void main(String[] args) {

		System.out.println(quadrato(12));

	}

}
