import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        System.out.println("Divisores de um Número");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
