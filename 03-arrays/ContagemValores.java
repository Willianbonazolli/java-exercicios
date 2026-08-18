public class ContagemValores {
    public static void main(String[] args) {
        System.out.println("Contagem de Valores");

        int[] valores = {3, -1, 0, 8, -5, 10, 0, 12, -7, 4, 0, 15};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int valor : valores) {
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}
