import java.util.Scanner;

public class Atividade60 {
    public static void main(String[] args) {

                int a = 0, b = 1;
                int contador = 1;

                System.out.print("Sequência de Fibonacci: " + a + " " + b);

                do {
                    int proximo = a + b;
                    System.out.print(" " + proximo);
                    a = b;
                    b = proximo;
                    contador++;
                } while (contador < 19);

    }
}
