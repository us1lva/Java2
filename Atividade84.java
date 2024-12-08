import java.util.Scanner;

public class Atividade84 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int contadorPares = 0;

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        contadorPares++;
                    }
                }

                System.out.println("Quantidade de números pares: " + contadorPares);

    }
}
