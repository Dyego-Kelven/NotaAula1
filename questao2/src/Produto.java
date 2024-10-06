public class Produto {
    private int codigo;
    private String nome;
    private String tamanho;
    private String cor;
    private double valor;
    private int quantidadeEstoque;


    public Produto(int codigo, String nome, String tamanho, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    @Override
    public String toString() {
        return "Produto: " + nome + " (Código: " + codigo + "), Tamanho: " + tamanho + ", Cor: " + cor +
                ", Valor: R$" + String.format("%.2f", valor) + ", Quantidade em Estoque: " + quantidadeEstoque;
    }
}
