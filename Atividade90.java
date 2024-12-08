import java.util.Scanner;

public class Atividade90 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                boolean temZero = false;

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();
                    if (numero == 0) {
                        temZero = true;
                    }
                }

                if (temZero) {
                    System.out.println("Foi digitado pelo menos um número igual a zero.");
                } else {
                    System.out.println("Nenhum número igual a zero foi digitado.");
                }

    }
}
