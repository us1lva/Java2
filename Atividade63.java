import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                String numeroStr = Integer.toString(numero);
                int i = 0;

                do {
                    System.out.println(numeroStr.charAt(i));
                    i++;
                } while (i < numeroStr.length());

    }
}
