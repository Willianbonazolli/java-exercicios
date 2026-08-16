public class SistemaProdutos {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Notebook", 2500.0, 3),
            new Produto("Mouse", 80.0, 15),
            new Produto("Teclado", 150.0, 8)
        };

        for (Produto produto : produtos) {
            produto.exibirDados();
            System.out.println("----------------------");
        }

        produtos[0].aplicarDesconto(10);
        System.out.println("Novo preço do notebook: R$ " + produtos[0].getPreco());
    }
}
