import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o peso em kg: ");
                double peso = scanner.nextDouble();
                System.out.print("Digite a altura m: ");
                double altura = scanner.nextDouble();

                double imc = peso / (altura * altura);
                String classificacao;

                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc >= 18.5 && imc < 24.9) {
                    classificacao = "Peso normal";
                } else if (imc >= 25 && imc < 29.9) {
                    classificacao = "Sobrepeso";
                } else {
                    classificacao = "Obesidade";
                }

                System.out.printf("O seu IMC é: %.2f%n", imc);
                System.out.println("Classificação: " + classificacao);

    }
}
