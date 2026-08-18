import java.util.Scanner;

public class BuscaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 9, 12, 18, 25, 30};

        System.out.print("Digite o valor a buscar: ");
        int valor = scanner.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado no array.");
        } else {
            System.out.println("Valor não encontrado no array.");
        }

        scanner.close();
    }
}
