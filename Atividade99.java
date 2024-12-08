import java.util.Scanner;

public class Atividade99 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz1 = new int[2][2];
                int[][] matriz2 = new int[2][2];
                int[][] somaMatriz = new int[2][2];

                System.out.println("Digite os elementos da primeira matriz 2x2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz1[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("Digite os elementos da segunda matriz 2x2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz2[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }

                System.out.println("A soma das duas matrizes 2x2 é:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(somaMatriz[i][j] + " ");
                    }
                    System.out.println();
                }

    }
}
