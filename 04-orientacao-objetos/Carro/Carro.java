import java.util.ArrayList;
import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private double velocidadeMaxima;

    public Carro(String marca, String modelo, int ano, double quilometragem, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void alterarDadosCarro(Scanner tipo) {
        boolean condition = true;
        int step = 0;

        while (condition) {
            try {
                if (step == 0) {
                    System.out.println("Digite a marca:");
                    marca = tipo.next();
                    step++;
                }

                if (step == 1) {
                    System.out.println("Digite o modelo:");
                    modelo = tipo.next();
                    step++;
                }

                if (step == 2) {
                    System.out.println("Digite o ano:");
                    ano = tipo.nextInt();
                    step++;
                }

                if (step == 3) {
                    System.out.println("Digite a quilometragem:");
                    quilometragem = tipo.nextDouble();
                    step++;
                }

                if (step == 4) {
                    System.out.println("Digite a velocidade máxima:");
                    velocidadeMaxima = tipo.nextDouble();
                    step++;
                }

                System.out.println("Dados do carro alterados com sucesso!");
                condition = false;

            } catch (Exception ex) {
                System.err.println("Informação inválida. Digite novamente.");
                tipo.nextLine();
            }
        }
    }

    public static Carro criarDadosCarro(Scanner tipo) {
        boolean condition = true;

        String marca = "";
        String modelo = "";
        int ano = 0;
        double quilometragem = 0;
        double velocidadeMaxima = 0;

        while (condition) {
            try {
                System.out.println("Digite a marca:");
                marca = tipo.next();

                System.out.println("Digite o modelo:");
                modelo = tipo.next();

                System.out.println("Digite o ano:");
                ano = tipo.nextInt();

                System.out.println("Digite a quilometragem:");
                quilometragem = tipo.nextDouble();

                System.out.println("Digite a velocidade máxima:");
                velocidadeMaxima = tipo.nextDouble();

                condition = false;

            } catch (Exception ex) {
                System.err.println("Informação inválida. Digite novamente.");
                tipo.nextLine();
            }
        }

        System.out.println("Dados do carro criados com sucesso!");

        return new Carro(
                marca,
                modelo,
                ano,
                quilometragem,
                velocidadeMaxima
        );
    }

    public void velocidadeMaxima() {
        System.out.println(
                "O carro possui velocidade máxima de "
                        + velocidadeMaxima
                        + " km/h."
        );
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }

    public static void main(String[] args) {

        Scanner tipo = new Scanner(System.in);

        ArrayList<Carro> carros = new ArrayList<>();

        // Carro inicial
        carros.add(
                new Carro(
                        "Toyota",
                        "Hilux",
                        2022,
                        15000,
                        220
                )
        );

        int opcao = -1;

        while (opcao != 4) {

            System.out.println("\nDigite o que você deseja fazer:");
            System.out.println("1. Detalhes");
            System.out.println("2. Alterar informações do carro");
            System.out.println("3. Adicionar novo carro");
            System.out.println("4. Sair");

            try {
                opcao = tipo.nextInt();

                switch (opcao) {

                    case 1: {

                        if (carros.isEmpty()) {
                            System.out.println("Nenhum carro cadastrado.");
                            break;
                        }

                        System.out.println("\nCarros cadastrados:");

                        for (int i = 0; i < carros.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". "
                                            + carros.get(i).marca
                                            + " "
                                            + carros.get(i).modelo
                            );
                        }

                        System.out.println("Digite o número do carro:");

                        int numeroCarro = tipo.nextInt();

                        if (numeroCarro >= 1 && numeroCarro <= carros.size()) {

                            Carro carroSelecionado = carros.get(numeroCarro - 1);

                            System.out.println("\nDetalhes do carro:");
                            carroSelecionado.exibirDetalhes();

                        } else {
                            System.out.println("Carro inválido.");
                        }

                        break;
                    }

                    case 2: {

                        if (carros.isEmpty()) {
                            System.out.println("Nenhum carro cadastrado.");
                            break;
                        }

                        System.out.println("\nCarros cadastrados:");

                        for (int i = 0; i < carros.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". "
                                            + carros.get(i).marca
                                            + " "
                                            + carros.get(i).modelo
                            );
                        }

                        System.out.println(
                                "Digite o número do carro que deseja alterar:"
                        );

                        int numeroCarro = tipo.nextInt();

                        if (numeroCarro >= 1 && numeroCarro <= carros.size()) {

                            Carro carroSelecionado =
                                    carros.get(numeroCarro - 1);

                            carroSelecionado.alterarDadosCarro(tipo);

                        } else {
                            System.out.println("Carro inválido.");
                        }

                        break;
                    }

                    case 3: {

                        Carro novoCarro = Carro.criarDadosCarro(tipo);

                        carros.add(novoCarro);

                        System.out.println(
                                "Carro adicionado à lista com sucesso!"
                        );

                        break;
                    }

                    case 4: {

                        System.out.println("Fechando o programa...");
                        break;
                    }

                    default: {

                        System.out.println("Opção inválida.");
                        break;
                    }
                }

            } catch (Exception ex) {

                System.err.println("Digite uma opção válida.");
                tipo.nextLine();
            }
        }

        tipo.close();
    }
}
