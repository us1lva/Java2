import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();

                if (idade >= 0 && idade <= 12) {
                    System.out.println("Você é uma criança.");
                } else if (idade >= 13 && idade <= 17) {
                    System.out.println("Você é um adolescente.");
                } else if (idade >= 18 && idade <= 64) {
                    System.out.println("Você é um adulto.");
                } else if (idade >= 65) {
                    System.out.println("Você é um idoso.");
                } else {
                    System.out.println("Idade inválida.");
                }
    }
}
