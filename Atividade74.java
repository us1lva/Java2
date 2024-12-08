import java.util.Scanner;

public class Atividade74 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int somaIdades = 0;

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade de " + nome + ": ");
                    int idade = scanner.nextInt();
                    somaIdades += idade;
                }

                double media = somaIdades / 5.0;
                System.out.println("A média das idades é: " + media);

    }
}
