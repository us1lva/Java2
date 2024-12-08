import java.util.Scanner;

public class Atividade105 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[4][4];
                int[] somaColunas = new int[4];

                System.out.println("Digite os elementos da matriz 4x4:");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                        somaColunas[j] += matriz[i][j];
                    }
                }

                System.out.println("A soma dos elementos de cada coluna é:");
                for (int j = 0; j < 4; j++) {
                    System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
                }

    }
}
