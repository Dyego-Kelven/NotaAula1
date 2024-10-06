public class SistemaDeControleDeProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de produto
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tamanho/peso: ");
        String tamanho = scanner.nextLine();

        System.out.print("Digite a cor: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(codigo, nome, tamanho, cor, valor, quantidade);

        // Venda do produto
        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        String formaPagamento = scanner.nextLine();

        produto.realizarVenda(quantidadeVendida, formaPagamento);

        produto.mostrarEstoque();

        scanner.close();
    }
}