import java.util.Scanner;

public class DescontoCliente {
    public static void main(String[] args) {
        System.out.println("Desconto de Cliente");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        double valorFinal = valor;
        if (valor > 100) {
            valorFinal = valor * 0.90;
            System.out.println("Desconto de 10% aplicado.");
        }

        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
