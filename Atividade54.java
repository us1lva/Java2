import java.util.Scanner;

public class Atividade54 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int soma = 0;
                int contador = 0;

                do {
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();
                    soma += numero;
                    contador++;
                } while (contador < 5);

                double media = soma / 5.0;
                System.out.println("A média aritmética dos valores lidos é: " + media);

    }
}
