import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o nome do mês: ");
                String mes = scanner.nextLine().toLowerCase();

                int dias;
                switch (mes) {
                    case "janeiro":
                    case "março":
                    case "maio":
                    case "julho":
                    case "agosto":
                    case "outubro":
                    case "dezembro":
                        dias = 31;
                        break;
                    case "abril":
                    case "junho":
                    case "setembro":
                    case "novembro":
                        dias = 30;
                        break;
                    case "fevereiro":
                        dias = 28; // Considerando anos não bissextos
                        break;
                    default:
                        System.out.println("Mês inválido.");
                        return;
                }

                System.out.println("O mês de " + mes + " tem " + dias + " dias.");
    }
}
