import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);
    }
}
