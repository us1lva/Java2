import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o peso kg: ");
                double peso = scanner.nextDouble();
                System.out.print("Digite a altura cm: ");
                double altura = scanner.nextDouble();

                double imc = peso / (altura * altura);

                System.out.printf("O seu IMC é: %.2f%n", imc);

                scanner.close();
    }
}
