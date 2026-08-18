import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Número Primo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
