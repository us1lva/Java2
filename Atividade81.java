import java.util.Scanner;

public class Atividade81 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[5];

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                System.out.println("Números na ordem inversa:");
                for (int i = 4; i >= 0; i--) {
                    System.out.println(numeros[i]);
                }

    }
}
