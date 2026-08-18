import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeCaixa {

    static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            if (quantidade < 0) throw new IllegalArgumentException("Quantidade não pode ser negativa.");
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public double subtotal() {
            return preco * quantidade;
        }

        public void exibir() {
            System.out.printf("%-20s x%d  R$ %.2f%n", nome, quantidade, subtotal());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== CAIXA ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Ver carrinho");
            System.out.println("3. Finalizar compra");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço unitário: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        carrinho.add(new Produto(nome, preco, qtd));
                        System.out.println("Produto adicionado.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio.");
                    } else {
                        carrinho.forEach(Produto::exibir);
                    }
                    break;
                case 3:
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio.");
                        break;
                    }
                    double total = carrinho.stream()
                                          .mapToDouble(Produto::subtotal)
                                          .sum();
                    System.out.printf("%nTotal: R$ %.2f%n", total);
                    System.out.print("Aplicar desconto (%)? [0 para nenhum]: ");
                    double desconto = scanner.nextDouble();
                    if (desconto > 0 && desconto <= 100) {
                        double valorFinal = total * (1 - desconto / 100);
                        System.out.printf("Desconto de %.0f%% aplicado.%n", desconto);
                        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                    } else {
                        System.out.printf("Valor final: R$ %.2f%n", total);
                    }
                    carrinho.clear();
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
