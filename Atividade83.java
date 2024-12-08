import java.util.Scanner;

public class Atividade83 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int soma = 0;

                for (int i = 0; i < 7; i++) {
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    soma += numero;
                }

                double media = soma / 7.0;
                System.out.println("A média aritmética dos valores lidos é: " + media);

    }
}
