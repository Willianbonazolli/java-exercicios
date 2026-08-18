import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));

        if (n2 != 0) {
            System.out.println("Divisão: " + (n1 / n2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
