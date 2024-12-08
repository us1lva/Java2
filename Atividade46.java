import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                int soma = 0;
                int i = 1;

                while (i <= numero) {
                    if (i % 2 == 0) {
                        soma += i;
                    }
                    i++;
                }

                System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);

    }
}
