class Exp {
    static int max(int[][] m, int sx, int dx) {
        if(sx<dx) {
            int l = max(m, sx, (sx+dx)/2);
            int r = max(m, sx, (dx+sx)/2);
        }
        //else non ho fatto in tempo a copiare :(


        return m[sx].length;
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3,4,5,6},{1,2,3,4,5},{1,2,3},{1,2,3,4,5,6,7,8}};
        System.out.println(conta_pari_dic(m, 0, m.length-1));
    }

}