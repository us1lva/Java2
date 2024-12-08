import java.util.Scanner;

public class Atividade91 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int somaPositivos = 0;
                int somaNegativos = 0;

                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();
                    if (numero > 0) {
                        somaPositivos += numero;
                    } else if (numero < 0) {
                        somaNegativos += numero;
                    }
                }

                System.out.println("A soma dos valores positivos é: " + somaPositivos);
                System.out.println("A soma dos valores negativos é: " + somaNegativos);

    }
}
