import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o valor do salário-mínimo: ");
                double salarioMinimo = scanner.nextDouble();
                System.out.print("Digite o salário do funcionário: ");
                double salarioFuncionario = scanner.nextDouble();

                double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

                System.out.printf("O funcionário recebe %.2f salários-mínimos.%n", quantidadeSalariosMinimos);

    }
}
