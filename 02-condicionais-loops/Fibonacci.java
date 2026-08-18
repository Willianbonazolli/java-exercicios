import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int quantidade = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();
        scanner.close();
    }
}
