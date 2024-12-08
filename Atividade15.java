import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o salário atual do funcionário: ");
                double salarioAtual = scanner.nextDouble();

                double aumento = salarioAtual * 0.15;
                double novoSalario = salarioAtual + aumento;

                System.out.printf("O novo salário do funcionário é: %.2f%n", novoSalario);

    }
}
