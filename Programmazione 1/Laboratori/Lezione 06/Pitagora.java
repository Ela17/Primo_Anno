import java.util.Scanner;

public class Pitagora {

	public static void tavolaPitagorica () {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.format("%3d \t", i*j);
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		tavolaPitagorica();
	}	
	
}