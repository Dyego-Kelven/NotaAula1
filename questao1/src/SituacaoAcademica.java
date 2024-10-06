import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média de " + nome + " foi " + media);

        if (media >= 7.0) {
            System.out.println(" O aluno " +nome+" está Aprovado!");
        } else if (media < 4.0) {
            System.out.println(" O aluno " +nome+" está Reprovado!");
        } else {
            System.out.println(" O aluno " +nome+" está Final!");
        }

        scanner.close();
    }
}