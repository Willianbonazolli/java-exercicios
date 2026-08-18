import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Nome: " + nome + ", idade: " + idade + ", cidade: " + cidade + ".");

        scanner.close();
    }
}
