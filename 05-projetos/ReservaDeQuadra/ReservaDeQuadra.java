import java.util.Scanner;

public class ReservaDeQuadra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da quadra: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o dia da reserva: ");
        String dia = scanner.nextLine();

        System.out.print("Digite o horário da reserva: ");
        String horario = scanner.nextLine();

        System.out.println("Reserva confirmada!");
        System.out.println("Quadra: " + nome);
        System.out.println("Dia: " + dia);
        System.out.println("Horário: " + horario);

        scanner.close();
    }
}
