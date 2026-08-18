import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculadora de Área de um Círculo");

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.2f%n", area);

        scanner.close();
    }
}
