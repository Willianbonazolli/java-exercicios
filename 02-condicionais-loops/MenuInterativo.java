import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        System.out.println("Menu Interativo");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Exibir mensagem");
            System.out.println("2. Mostrar data");
            System.out.println("3. Realizar operação matemática");
            System.out.println("4. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Bem-vindo ao sistema!");
                    break;
                case 2:
                    System.out.println("Data atual: 16/08/2026");
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    int a = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("Soma: " + (a + b));
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
