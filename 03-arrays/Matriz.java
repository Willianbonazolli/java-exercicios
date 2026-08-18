public class Matriz {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elena"};

        double[][] notas = {
            {8.0, 7.5, 9.0},
            {6.0, 5.5, 7.0},
            {9.5, 8.0, 9.0},
            {4.0, 6.5, 5.0},
            {7.0, 8.5, 8.0}
        };

        double maiorMedia = -1;
        String melhorAluno = "";

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf("%-8s → média: %.2f%n", nomes[i], media);

            if (media > maiorMedia) {
                maiorMedia = media;
                melhorAluno = nomes[i];
            }
        }

        System.out.println("\nMelhor aluno: " + melhorAluno +
                           String.format(" (%.2f)", maiorMedia));
    }
}
