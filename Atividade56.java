import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro positivo: ");
                int numero = scanner.nextInt();

                if (numero <= 0) {
                    System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
                } else {
                    int divisor = 1;
                    System.out.println("Os divisores de " + numero + " são:");
                    do {
                        if (numero % divisor == 0) {
                            System.out.println(divisor);
                        }
                        divisor++;
                    } while (divisor <= numero);
                }

    }
}
