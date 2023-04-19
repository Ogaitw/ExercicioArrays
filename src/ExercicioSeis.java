import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        int[] vetorC = new int[30];

        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println(" Digite o vetor A:");
            vetorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o velor do vetor B:");
            vetorB[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Digite o valor do Vetor C:");
            vetorC[i] = scanner.nextInt();

        }
    }
}
