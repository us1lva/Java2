import java.util.Scanner;

public class Atividade64 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                int fatorial = 1;
                int i = 1;

                do {
                    fatorial *= i;
                    i++;
                } while (i <= numero);

                System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
