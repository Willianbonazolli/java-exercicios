public class MaiorNumero {
    public static void main(String[] args) {
        System.out.println("Maior Número");

        int[] numeros = {12, 45, 7, 89, 23, 54};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
