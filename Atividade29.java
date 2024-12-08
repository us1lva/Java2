import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a nota do aluno: ");
                double nota = scanner.nextDouble();

                if (nota >= 7) {
                    System.out.println("O aluno " + nome + " está aprovado.");
                } else {
                    System.out.println("O aluno " + nome + " está em recuperação.");
                }

    }
}
