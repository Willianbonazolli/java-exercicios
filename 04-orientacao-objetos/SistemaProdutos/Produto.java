public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco = preco * (1 - percentual / 100.0);
            System.out.println("Desconto aplicado em " + nome + ".");
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotalEstoque());
    }
}
