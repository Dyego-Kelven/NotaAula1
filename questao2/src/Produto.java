class Produto {
    private int codigo;
    private String nome;
    private String tamanho;
    private String cor;
    private double valor;
    private int quantidade;

    public Produto(int codigo, String nome, String tamanho, String cor, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void realizarVenda(int quantidadeVendida, String formaPagamento) {
        if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente!");
            return;
        }
        this.quantidade -= quantidadeVendida;
        double valorTotal = valor * quantidadeVendida;
        if (formaPagamento.equalsIgnoreCase("Pix") || formaPagamento.equalsIgnoreCase("Espécie") ||
                formaPagamento.equalsIgnoreCase("Transferência") || formaPagamento.equalsIgnoreCase("Débito")) {
            valorTotal *= 0.95;
        }

        System.out.println("Valor total a pagar: R$" + valorTotal);
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Estoque atual: " + quantidade);
    }
}