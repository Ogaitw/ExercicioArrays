import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite o " + (i+1) +"° Numero");
            number[i] = scanner.nextInt();
            
        }

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(number[i]);
        }
    }
}
