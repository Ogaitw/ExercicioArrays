import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++) {
            vetorA[i] += scanner.nextInt();

            for (int j = vetorA[i] ; j >= 1; j--) {
                if (vetorB[i] == 0) {
                    vetorB[i] = j--;
                }
                vetorB[i] *= j;
                if (vetorB[i] == 0) {
                     vetorB[i] = 1;
                }
            }
        }


        System.out.print(" "+ Arrays.toString(vetorA)+"\n");
        System.out.print(" "+ Arrays.toString(vetorB)+"\n");
    }
}