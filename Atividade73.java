import java.util.Scanner;

public class Atividade73 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();

                int a = 0, b = 1;
                System.out.print("Sequência de Fibonacci: " + a + " " + b);

                for (int proximo = a + b; proximo <= numero; proximo = a + b) {
                    System.out.print(" " + proximo);
                    a = b;
                    b = proximo;
                }

    }
}
