import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int somaIdades = 0;
                int contador = 0;

                while (true) {
                    System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
                    String nome = scanner.next();
                    if (nome.equalsIgnoreCase("fim")) {
                        break;
                    }
                    System.out.print("Digite a idade de " + nome + ": ");
                    int idade = scanner.nextInt();
                    somaIdades += idade;
                    contador++;
                }

                if (contador > 0) {
                    double media = somaIdades / (double) contador;
                    System.out.println("A média das idades é: " + media);
                } else {
                    System.out.println("Nenhuma idade foi informada.");
                }

    }
}
