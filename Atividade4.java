import java.util.Scanner;
import java.text.DecimalFormat;
public class Atividade4 {
    public static void main(String[] args) {

        float n1, n2, n3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextFloat();

        float media = (n1 + n2 + n3) / 3;
        float ponderada = (2*n1 + 3*n2 + 5*n3 )/(2+3+5);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("A média das notas: " + n1 + " " + n2 + " " + n3 + " = " + df.format(media));
        System.out.println("A ponderada: " + ponderada);

    }
}
