public class ArrayDiArrays {
    
    public static void main(String[] args) {
        // Array di interi (anche: vettore di interi)
        int[] a = {10, 20, 30};
        
        // Array di array di interi
        int[][] mat1 = {
            {0, 1, 3},  // mat1[0]
            {3, 5, 6},  // mat1[1]
            a           // mat1[2]
        };
        System.out.println("\nmat1 =");
        stampaMatrice(mat1);
        System.out.println("");
        
        // Gli elementi di un array di array sono array semplici
        int[] row0 = mat1[0]; // {0, 1, 3}
        
        // Per accedere agli elementi interi, si accede con due indirezioni
        // Esempio: riga 2 in mat1 (cioè a), elemento con indice 1 (cioè 20)
        System.out.println("mat1[2][1] = "+mat1[2][1]);
        
        // Gli array che compongono un array di array sono INDIPENDENTI.
        // Quindi ciascuno può avere una lunghezza diversa. 
        // Un array di array di questo genere si dice un jagged array, o ragged array.
        // In italiano: array frastagliato, matrice irregolare.
        int[][] mat2 = {
            {0, 1, 6, 7, 9},
            {1, 4},
            {3, 6, 10, 21},
            null,
            {1},
            mat1[2],
            {}
        };
        
        System.out.println("mat2 ha "+mat2.length+" righe.");
        for (int i=0; i<mat2.length; i++) {
            if (mat2[i] == null)
                System.out.println("  la riga "+i+" di mat2 e' null.");
            else
                System.out.println("  la riga "+i+" di mat2 ha "+mat2[i].length+" elementi.");
        }
        System.out.println("\nmat2 =");
        stampaMatrice(mat2);
        
        // Creo una matrice 5*8, dove ogni elemento i,j ha valore pari a i+j
        final int R = 5, C = 8; // Righe, Colonne
        
        // Creo l'array di arrays con R righe
        int[][] mat3 = new int[R][];
        
        // Creo una riga alla volta
        for (int row = 0; row<R; row++) {
            // Crea l'array per la riga @row con C elementi
            mat3[row] = new int[C];
            // Inizializza tutti gli elementi della riga
            for (int col=0; col<mat3[row].length; col++)
                mat3[row][col] = row + col;
        }
        System.out.println("\nmat3 =");
        stampaMatrice(mat3);
    }
    
    
    // stampa un'array di arrays a video.
    public static void stampaMatrice(int[][] mat) {
        if (mat != null) {
            // Per ogni riga
            for (int i=0; i<mat.length; i++) {
                if (mat[i] != null) {
                    System.out.print("  {");
                    // Per ogni elemento sulla riga i
                    for (int j=0; j<mat[i].length; j++) {
                        if (j>0)
                            System.out.print(", ");
                        System.out.print(mat[i][j]);
                    }
                    System.out.println("}");                    
                }
                else
                    System.out.println("  null");
            }
        }
    }
}