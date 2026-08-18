import java.util.Scanner;

public class InversaoVetor {
    public static void main(String[] args) {
        System.out.println("Inversão de Vetor");

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ordem invertida:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
