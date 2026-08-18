import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        System.out.println("Conversor de Moeda");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorEmReais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        double valorConvertido = valorEmReais / cotacao;
        System.out.printf("Valor em dólares: %.2f%n", valorConvertido);

        scanner.close();
    }
}
