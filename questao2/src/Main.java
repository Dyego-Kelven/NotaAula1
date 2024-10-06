import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.println("Qual o nome do produto ?");
        String nome = sc.nextLine();

        System.out.println("Qual o codigo do produto ?");
        int codigo = sc.nextInt();
        sc.nextLine();  // Limpa o buffer do Scanner

        System.out.println("Qual o tamanho do produto ?");
        String tamanho = sc.nextLine();

        System.out.println("Qual a cor do produto ?");
        String cor = sc.nextLine();

        System.out.println("Qual o valor do produto ?");
        double valor = sc.nextDouble();

        System.out.println("Qual a quantidade que tem em estoque ?");
        int estoque = sc.nextInt();

        // Criando o objeto Produto com os dados inseridos pelo usuário (removido o tipo da instância)
        Produto produto1 = new Produto(codigo, nome, tamanho, cor, valor, estoque);

        // Exibindo os detalhes do produto
        System.out.println(produto1.toString());

        // Fechando o Scanner
        sc.close();
    }
}
