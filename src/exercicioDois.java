import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] VetorA = new int[8];
        int [] VetorB = new  int[8];
        System.out.println("Digite o valor do vetor A");
        for (int i = 0; i < 8 ; i++) {
            VetorA[i] = scanner.nextInt();
            VetorB[i] =  VetorA[i] * 3;
        }
        for (int i = 0; i < 8 ; i++) {
            System.out.println("Valor do vetor B " + i +  " é: " + VetorB[i]);
        }
    }
}
