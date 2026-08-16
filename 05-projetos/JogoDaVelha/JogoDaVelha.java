import java.util.Scanner;

public class JogoDaVelha {
    private static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirTabuleiro();
            System.out.println("Jogador " + jogadorAtual + ", escolha linha e coluna (0-2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Movimento inválido. Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;

            if (verificarVitoria(jogadorAtual)) {
                exibirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            if (verificarEmpate()) {
                exibirTabuleiro();
                System.out.println("Empate!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static void exibirTabuleiro() {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    private static boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) return true;
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) return true;
        }

        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) return true;
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) return true;

        return false;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
