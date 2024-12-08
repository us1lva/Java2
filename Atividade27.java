import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o sexo (M ou F): ");
                char sexo = scanner.next().charAt(0);

                boolean podeAposentar = false;

                if (sexo == 'M' || sexo == 'm') {
                    if (idade >= 65) {
                        podeAposentar = true;
                    }
                } else if (sexo == 'F' || sexo == 'f') {
                    if (idade >= 60) {
                        podeAposentar = true;
                    }
                } else {
                    System.out.println("Sexo inválido.");
                    scanner.close();
                    return;
                }

                if (podeAposentar) {
                    System.out.println("Você pode se aposentar.");
                } else {
                    System.out.println("Você não pode se aposentar ainda.");
                }

    }
}
