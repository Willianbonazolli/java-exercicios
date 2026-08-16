public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível no momento.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro " + titulo + " devolvido com sucesso.");
        } else {
            System.out.println("Livro já está disponível.");
        }
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
