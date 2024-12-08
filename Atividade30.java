import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o número de maçãs compradas: ");
                int quantidade = scanner.nextInt();

                double preco;
                if (quantidade < 12) {
                    preco = 0.50;
                } else {
                    preco = 0.40;
                }

                double valorTotal = quantidade * preco;

                System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

    }
}
