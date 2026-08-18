import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<String> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
        contatos.add("Ana");
        contatos.add("Bruno");
    }

    public void adicionarContato(String nome) {
        contatos.add(nome);
    }

    public void listarContatos() {
        for (String contato : contatos) {
            System.out.println(contato);
        }
    }

    public boolean buscarContato(String nome) {
        return contatos.contains(nome);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = -1;

        do {
            System.out.println("\n===== Agenda de Contatos =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = scanner.nextLine().trim();
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String novoNome = scanner.nextLine().trim();
                    agenda.adicionarContato(novoNome);
                    System.out.println("Contato adicionado!");
                    break;

                case 2:
                    System.out.println("--- Contatos ---");
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.print("Digite o nome para buscar: ");
                    String nomeBusca = scanner.nextLine().trim();
                    System.out.println(agenda.buscarContato(nomeBusca) ? "Contato encontrado" : "Contato não encontrado");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}