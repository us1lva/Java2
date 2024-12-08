import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int numero1,numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o primeiro valor? ");
        numero1 = entrada.nextInt();

        System.out.println("Qual o segundo valor? ");
        numero2 = entrada.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("A soma dos numeros: " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("Subtração dos numeros: " + numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println("Multiplicação dos numeros: " + numero1 + " * " + numero2 + " = " + multiplicacao);
        System.out.println("Divisão dos numeros: " + numero1 + " / " + numero2 + " = " + divisao);
    }
}
