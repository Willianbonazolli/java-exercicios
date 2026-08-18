import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroClientes {

    static class Cliente {
        private String nome;
        private String telefone;
        private String email;

        public Cliente(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }

        public String getNome() { return nome; }

        public void exibirDados() {
            System.out.println("Nome    : " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("E-mail  : " + email);
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Pesquisar por nome");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    clientes.add(new Cliente(nome, telefone, email));
                    System.out.println("Cliente cadastrado.");
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        clientes.forEach(Cliente::exibirDados);
                    }
                    break;
                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if (c.getNome().equalsIgnoreCase(busca)) {
                            c.exibirDados();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Cliente não encontrado.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
