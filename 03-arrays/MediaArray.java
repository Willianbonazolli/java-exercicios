public class MediaArray {
    public static void main(String[] args) {
        System.out.println("Média de um Array");

        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = soma / (double) numeros.length;
        System.out.println("Média: " + media);
    }
}
