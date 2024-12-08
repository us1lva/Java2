import java.util.Scanner;

public class Atividade94 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[7];

                for (int i = 0; i < 7; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                System.out.println("Números pares:");
                for (int numero : numeros) {
                    if (numero % 2 == 0) {
                        System.out.println(numero);
                    }
                }

    }
}
