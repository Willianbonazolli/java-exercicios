import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        System.out.println("Maior de Três Números");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
