import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeFilmes {

    static class Filme {
        private String titulo;
        private String genero;
        private double avaliacao;

        public Filme(String titulo, String genero, double avaliacao) {
            this.titulo = titulo;
            this.genero = genero;
            this.avaliacao = avaliacao;
        }

        public String getTitulo() { return titulo; }
        public double getAvaliacao() { return avaliacao; }

        public void exibir() {
            System.out.printf("%-30s | %-15s | %.1f%n", titulo, genero, avaliacao);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== GERENCIADOR DE FILMES ===");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Listar filmes");
            System.out.println("3. Pesquisar por título");
            System.out.println("4. Média das avaliações");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Avaliação (0-10): ");
                    double avaliacao = scanner.nextDouble();
                    scanner.nextLine();
                    filmes.add(new Filme(titulo, genero, avaliacao));
                    System.out.println("Filme cadastrado.");
                    break;
                case 2:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        System.out.printf("%-30s | %-15s | Nota%n", "Título", "Gênero");
                        System.out.println("-".repeat(55));
                        filmes.forEach(Filme::exibir);
                    }
                    break;
                case 3:
                    System.out.print("Título para buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Filme f : filmes) {
                        if (f.getTitulo().equalsIgnoreCase(busca)) {
                            f.exibir();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("Filme não encontrado.");
                    break;
                case 4:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        double media = filmes.stream()
                                            .mapToDouble(Filme::getAvaliacao)
                                            .average()
                                            .orElse(0);
                        System.out.printf("Média das avaliações: %.2f%n", media);
                    }
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
