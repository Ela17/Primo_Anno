class Matrice {
    static int conta_pari_dic(int[][] m, int sx, int dx) {
        if(sx<dx)
            return conta_pari_dic(m, sx, (sx+dx)/2) + conta_pari_dic(m, (sx+dx)/2+1, dx);
        else
            return conta_pari_contro(m[sx], 0);
    }

    static int conta_pari_contro(int[] a, int i) {
        if(i < a.length) 
            if(a[i] % 2 == 0)
                return 1 + conta_pari_contro(a, i + 1);
            else
                return conta_pari_contro(a, i + 1);
        else 
            return 0;
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3}};
        System.out.println(conta_pari_dic(m, 0, m.length-1));
    }
}