import java.util.Scanner;

public class Atividade108 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[4][4];

                System.out.println("Digite os elementos da matriz 4x4:");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < 4; i++) {
                    int maiorValor = matriz[i][0];
                    for (int j = 1; j < 4; j++) {
                        if (matriz[i][j] > maiorValor) {
                            maiorValor = matriz[i][j];
                        }
                    }
                    System.out.println("O maior valor na linha " + (i + 1) + " é: " + maiorValor);
                }

    }
}
