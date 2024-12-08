import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        int base, altura;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a base do triangulo: ");
        base = entrada.nextInt();

        System.out.print("Digite a altura do triangulo: ");
        altura = entrada.nextInt();

        int area = (base*altura)/2;

        System.out.println("Area do triangulo: " + area + "cm");
    }
}
