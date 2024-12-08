import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                double precoProduto1 = 10.0;
                double precoProduto2 = 20.0;
                double precoProduto3 = 30.0;

                System.out.print("Digite o código do produto (1, 2 ou 3): ");
                int codigoProduto = scanner.nextInt();
                System.out.print("Digite a quantidade comprada: ");
                int quantidade = scanner.nextInt();

                double valorTotal = 0;

                switch (codigoProduto) {
                    case 1:
                        valorTotal = precoProduto1 * quantidade;
                        break;
                    case 2:
                        valorTotal = precoProduto2 * quantidade;
                        break;
                    case 3:
                        valorTotal = precoProduto3 * quantidade;
                        break;
                    default:
                        System.out.println("Código de produto inválido.");
                        return;
                }

                System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

    }
}
