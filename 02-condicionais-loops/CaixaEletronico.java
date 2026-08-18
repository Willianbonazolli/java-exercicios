import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        System.out.println("Caixa Eletrônico");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();

        int cem = valor / 100;
        int resto = valor % 100;

        int cinquenta = resto / 50;
        resto %= 50;

        int vinte = resto / 20;
        resto %= 20;

        int dez = resto / 10;

        System.out.println("Notas de 100: " + cem);
        System.out.println("Notas de 50: " + cinquenta);
        System.out.println("Notas de 20: " + vinte);
        System.out.println("Notas de 10: " + dez);

        scanner.close();
    }
}
