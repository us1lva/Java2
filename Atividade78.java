import java.util.Scanner;

public class Atividade78 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                String numeroStr = Integer.toString(numero);

                for (int i = 0; i < numeroStr.length(); i++) {
                    System.out.println(numeroStr.charAt(i));
                }

    }
}
