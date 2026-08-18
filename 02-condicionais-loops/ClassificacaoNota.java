import java.util.Scanner;

public class ClassificacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 9.0) {
            System.out.println("Excelente");
        } else if (nota >= 7.0) {
            System.out.println("Bom");
        } else if (nota >= 5.0) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        scanner.close();
    }
}
