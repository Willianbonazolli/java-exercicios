public class Bibi {
    public static void main(String[] args) {
        Livro[] livros = {
            new Livro("Dom Casmurro", "Machado de Assis"),
            new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"),
            new Livro("Java Básico", "Fulano da Silva")
        };

        livros[0].emprestar();
        livros[0].exibirDados();
        livros[0].devolver();
        livros[0].exibirDados();
    }
}
