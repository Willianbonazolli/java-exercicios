import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario *= (1 + percentual / 100);
            System.out.printf("Novo salário: R$ %.2f%n", this.salario);
        } else {
            System.out.println("Percentual inválido.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome   : " + nome);
        System.out.println("Cargo  : " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário inicial: ");
        double salario = scanner.nextDouble();

        Funcionario f = new Funcionario(nome, cargo, salario);
        f.exibirDados();

        System.out.print("Percentual de aumento: ");
        double percentual = scanner.nextDouble();
        f.aumentarSalario(percentual);

        scanner.close();
    }
}
