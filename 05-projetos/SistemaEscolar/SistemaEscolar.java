import java.util.ArrayList;
import java.util.List;

public class SistemaEscolar {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        List<Double> notas = new ArrayList<>();

        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carla");

        notas.add(8.5);
        notas.add(7.0);
        notas.add(9.5);

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();

        System.out.println("Alunos: " + alunos);
        System.out.println("Média da turma: " + media);
    }
}
