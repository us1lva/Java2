import java.util.Scanner;

public class Atividade49 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                int fatorial = 1;
                int i = 1;

                while (i <= numero) {
                    fatorial *= i;
                    i++;
                }

                System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }
}
