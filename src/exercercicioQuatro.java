import java.util.Scanner;

public class exercercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] vetorA = new double[15];
        double [] vetorB =  new double[15];
        System.out.println(" Digite o Valor do Vetor A");
        for (int i = 0; i < 15; i++) {
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.pow(vetorA[i],2);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("O Valores respectivamentes:\n Valor do Vetor "+i+"A:"+vetorA[i] +"\n Valor do Vetor "+i+"B: "+i +vetorB[i]);

        }
    }
}
