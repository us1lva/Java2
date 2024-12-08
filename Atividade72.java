import java.util.Scanner;

public class Atividade72 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                boolean ehPrimo = true;

                if (numero <= 1) {
                    ehPrimo = false;
                } else {
                    for (int divisor = 2; divisor <= numero / 2; divisor++) {
                        if (numero % divisor == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                }

                if (ehPrimo) {
                    System.out.println(numero + " é um número primo.");
                } else {
                    System.out.println(numero + " não é um número primo.");
                }

    }
}
