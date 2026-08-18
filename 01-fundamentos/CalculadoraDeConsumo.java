import java.util.Scanner;

public class CalculadoraDeConsumo {
    public static void main(String[] args) {
        System.out.println("Calculadora de Consumo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível em litros: ");
        double combustivel = scanner.nextDouble();

        if (combustivel == 0) {
            System.out.println("Não é possível calcular o consumo com combustível igual a zero.");
        } else {
            double consumo = distancia / combustivel;
            System.out.printf("Consumo médio: %.2f km/l%n", consumo);
        }

        scanner.close();
    }
}
