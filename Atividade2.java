import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        int raio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        raio = entrada.nextInt();


        double pi = 3.14159;
        double perimetro = 2 * pi * raio;
        double area = pi * raio * raio;

        System.out.printf("Perímetro do círculo: %.2f\n", perimetro, "cm");
        System.out.printf("Área do círculo: %.2f\n", area, "cm");
    }
}
