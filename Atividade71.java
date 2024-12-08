import java.util.Scanner;

public class Atividade71 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();

                if (numero <= 0) {
                    System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
                } else {
                    System.out.println("Os divisores de " + numero + " são:");
                    for (int divisor = 1; divisor <= numero; divisor++) {
                        if (numero % divisor == 0) {
                            System.out.println(divisor);
                        }
                    }
                }

    }
}
