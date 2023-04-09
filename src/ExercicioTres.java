import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] NumeroUm = new int[20];
        int [] NumeroDois = new int[20];
        double [] NumeroTres = new double[20];

        System.out.println(" Digite 20 Valores para o vetor A");
        for (int i = 0; i < 20 ; i++) {
            NumeroUm[i] = scanner.nextInt();

        }
        System.out.println( " Digite o valor do vetor B");
        for (int i = 0; i < 20; i++) {
            NumeroDois[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
         NumeroTres[i] += NumeroUm[i] - NumeroDois[i];
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Valor de C"+i+" é: " + NumeroTres[i]);

        }
    }
}
