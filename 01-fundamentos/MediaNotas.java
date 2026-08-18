import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        System.out.println("Média de 3 notas");

        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 3;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
