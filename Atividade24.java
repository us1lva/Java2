import java.util.*;

public class Atividade24 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[3];

                System.out.print("Digite o primeiro número: ");
                numeros[0] = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                numeros[1] = scanner.nextInt();
                System.out.print("Digite o terceiro número: ");
                numeros[2] = scanner.nextInt();

                Arrays.sort(numeros);

                System.out.println("Os números em ordem crescente são:");
                for (int numero : numeros) {
                    System.out.println(numero);
                }

    }
}
