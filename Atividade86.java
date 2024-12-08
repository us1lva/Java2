import java.util.*;

public class Atividade86 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[10];

                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }

                Arrays.sort(numeros);

                System.out.println("Números em ordem crescente:");
                for (int numero : numeros) {
                    System.out.println(numero);
                }

    }
}
