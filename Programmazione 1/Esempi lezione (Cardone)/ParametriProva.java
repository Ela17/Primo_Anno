public class ParametriProva {
    static void incrementa(int[] x){
        x[0] = x[0] + 1;
    }

    public static void main(String[] args) {
        int[] x = new int[1];
        x[0]=0;
        System.out.println(x[0]);

        incrementa(x);

        System.out.println(x[0]);
    }
}
