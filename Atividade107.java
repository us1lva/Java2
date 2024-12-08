import java.util.Scanner;

public class Atividade107 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int produtoDiagonal = 1;

                System.out.println("Digite os elementos da matriz 3x3:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }

                for (int i = 0; i < 3; i++) {
                    produtoDiagonal *= matriz[i][2 - i];
                }

                System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonal);

    }
}
