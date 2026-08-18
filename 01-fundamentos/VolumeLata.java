import java.util.Scanner;

public class VolumeLata {
    public static void main(String[] args) {
        System.out.println("Calculadora de Volume de uma Lata");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata: ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume da lata: " + volume);

        scanner.close();
    }
}
