import java.util.*;

public class Atividade95 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String[] nomes = new String[5];

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o nome " + (i + 1) + ": ");
                    nomes[i] = scanner.nextLine();
                }

                Arrays.sort(nomes);

                System.out.println("Nomes em ordem alfabética:");
                for (String nome : nomes) {
                    System.out.println(nome);
                }

    }
}
