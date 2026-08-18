import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversor de Temperatura");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");

        scanner.close();
    }
}
