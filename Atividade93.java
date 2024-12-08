import java.util.Scanner;

public class Atividade93 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int contador = 0;

                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();
                    if (numero >= 10 && numero <= 50) {
                        contador++;
                    }
                }

                System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);

    }
}
