import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<String> contatos = new ArrayList<>();

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

        agenda.adicionarContato("Ana");
        agenda.adicionarContato("Bruno");
        agenda.listarContatos();

        System.out.print("Digite o nome para buscar: ");
        String nome = scanner.nextLine();
        System.out.println(agenda.buscarContato(nome) ? "Contato encontrado" : "Contato não encontrado");

        scanner.close();
    }
}
