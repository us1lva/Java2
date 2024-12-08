import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro positivo: ");
                int numero = scanner.nextInt();

                if (numero <= 0) {
                    System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
                } else {
                    int divisor = 1;
                    System.out.println("Os divisores de " + numero + " são:");
                    while (divisor <= numero) {
                        if (numero % divisor == 0) {
                            System.out.println(divisor);
                        }
                        divisor++;
                    }
                }

    }
}
