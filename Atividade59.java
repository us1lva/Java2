import java.util.Scanner;

public class Atividade59 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int somaIdades = 0;
                int contador = 0;

                do {
                    System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
                    String nome = scanner.next();
                    System.out.print("Digite a idade de " + nome + ": ");
                    int idade = scanner.nextInt();
                    somaIdades += idade;
                    contador++;
                } while (contador < 5);

                double media = somaIdades / 5.0;
                System.out.println("A média das idades é: " + media);

    }
}
