import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a nota do aluno: ");
                double nota = scanner.nextDouble();

                String conceito;
                if (nota >= 9 && nota <= 10) {
                    conceito = "A";
                } else if (nota >= 7 && nota < 9) {
                    conceito = "B";
                } else if (nota >= 5 && nota < 7) {
                    conceito = "C";
                } else if (nota >= 3 && nota < 5) {
                    conceito = "D";
                } else if (nota >= 0 && nota < 3) {
                    conceito = "E";
                } else {
                    conceito = "Nota inválida.";
                }

                System.out.println("A conceituação do aluno é: " + conceito);

    }
}
