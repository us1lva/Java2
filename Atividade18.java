import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                int primeiroNumero = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int segundoNumero = scanner.nextInt();

                if (primeiroNumero > segundoNumero) {
                    System.out.println("O maior número é: " + primeiroNumero);
                } else if (segundoNumero > primeiroNumero) {
                    System.out.println("O maior número é: " + segundoNumero);
                } else {
                    System.out.println("Os números são iguais.");
                }
    }
}