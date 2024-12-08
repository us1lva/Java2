import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Seu voto é obrigatório!!!");
        } else if (idade <= 17) {
            System.out.println("Seu voto não é obrigatório!!!");
        } else if (idade >= 70) {
            System.out.println("Seu voto não é obrigatório!!!");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
