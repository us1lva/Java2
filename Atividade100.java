import java.util.Scanner;

public class Atividade100 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int maiorValor = Integer.MIN_VALUE;

                System.out.println("Digite os elementos da matriz 3x3:");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                        if (matriz[i][j] > maiorValor) {
                            maiorValor = matriz[i][j];
                        }
                    }
                }

                System.out.println("O maior valor presente na matriz é: " + maiorValor);

    }
}
