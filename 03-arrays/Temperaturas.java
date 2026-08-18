public class Temperaturas {
    public static void main(String[] args) {
        System.out.println("Maior, Menor e Média de Temperaturas");

        double[] temperaturas = {22.5, 24.0, 23.7, 26.1, 25.9, 27.2, 24.8};

        double maior = temperaturas[0];
        double menor = temperaturas[0];
        double soma = 0;

        for (double temperatura : temperaturas) {
            if (temperatura > maior) maior = temperatura;
            if (temperatura < menor) menor = temperatura;
            soma += temperatura;
        }

        double media = soma / temperaturas.length;

        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Média: " + media);
    }
}
