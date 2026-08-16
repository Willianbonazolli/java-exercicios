import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int[] numeros = {9, 3, 7, 1, 5};

        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
