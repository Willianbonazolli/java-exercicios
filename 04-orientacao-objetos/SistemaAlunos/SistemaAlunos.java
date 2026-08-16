public class SistemaAlunos {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("Ana", 8.5, 7.0, 9.0),
            new Aluno("Bruno", 6.0, 5.5, 6.5),
            new Aluno("Carla", 4.0, 5.0, 3.5)
        };

        for (Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println("----------------------");
        }
    }
}
