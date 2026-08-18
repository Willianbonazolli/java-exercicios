import java.util.Scanner;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private double nota;

    public Filme(String titulo, String genero, int duracao, double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.nota = nota;
    }

    public boolean avaliacaoBoa() {
        return this.nota >= 7.0;
    }

    public void exibirDados() {
        System.out.println("Título  : " + titulo);
        System.out.println("Gênero  : " + genero);
        System.out.println("Duração : " + duracao + " min");
        System.out.printf("Nota    : %.1f%n", nota);
        System.out.println("Avaliação boa? " + (avaliacaoBoa() ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Duração (min): ");
        int duracao = scanner.nextInt();

        System.out.print("Nota (0 a 10): ");
        double nota = scanner.nextDouble();

        Filme filme = new Filme(titulo, genero, duracao, nota);
        filme.exibirDados();

        scanner.close();
    }
}
