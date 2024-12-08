import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                int a = 0, b = 1;
                System.out.print("Sequência de Fibonacci: " + a + " " + b);

                int proximo = a + b;
                while (proximo <= numero) {
                    System.out.print(" " + proximo);
                    a = b;
                    b = proximo;
                    proximo = a + b;
                }

    }
}
