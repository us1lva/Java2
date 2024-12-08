import java.util.Scanner;

public class Atividade75 {
    public static void main(String[] args) {

                int a = 0, b = 1;

                System.out.print("Sequência de Fibonacci: " + a + " " + b);

                for (int i = 3; i <= 20; i++) {
                    int proximo = a + b;
                    System.out.print(" " + proximo);
                    a = b;
                    b = proximo;
                }

    }
}
