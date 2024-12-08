import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade5 {
    public static void main(String[] args) {
        float preco, finalpreco;
        int quantidade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        preco = entrada.nextFloat();

        System.out.println("Quantidade de produtos: ");
        quantidade = entrada.nextInt();

        finalpreco = preco * quantidade;

        DecimalFormat df = new DecimalFormat("#.00");

        if (quantidade > 10){
            float desconto = finalpreco * 0.10f;
            float precoDesconto = finalpreco - desconto;
            System.out.println("A sua compra teve um desconto de R$ " +  df.format(desconto) + " Assim, o valor final é R$ " + df.format(precoDesconto));
        } else {
            System.out.println("O valor de sua compra é de R$ " + finalpreco);
        }
    }
}
