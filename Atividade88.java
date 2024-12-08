import java.util.Scanner;

public class Atividade88 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int somaPares = 0;
                int somaImpares = 0;
                int contadorPares = 0;
                int contadorImpares = 0;

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    if (numero % 2 == 0) {
                        somaPares += numero;
                        contadorPares++;
                    } else {
                        somaImpares += numero;
                        contadorImpares++;
                    }
                }

                double mediaPares = (contadorPares > 0) ? (double) somaPares / contadorPares : 0;
                double mediaImpares = (contadorImpares > 0) ? (double) somaImpares / contadorImpares : 0;

                System.out.println("A média dos valores pares é: " + mediaPares);
                System.out.println("A média dos valores ímpares é: " + mediaImpares);

    }
}
