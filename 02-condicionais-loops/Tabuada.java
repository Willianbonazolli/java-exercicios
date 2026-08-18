import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Tabuada");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
