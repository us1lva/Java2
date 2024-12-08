import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int primeiroNumero = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int segundoNumero = scanner.nextInt();

                if (primeiroNumero % segundoNumero == 0) {
                    System.out.println("O número " + primeiroNumero + " é múltiplo de " + segundoNumero);
                } else {
                    System.out.println("O número " + primeiroNumero + " não é múltiplo de " + segundoNumero);
                }

    }
}
