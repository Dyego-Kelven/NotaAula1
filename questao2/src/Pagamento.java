class Pagamento {
    public static void realizarPagamento(Produto produto, String formaPagamento, double valorPago) {
        double valorComDesconto = produto.getValor();
        double desconto = 0;
        double troco = 0;

        switch (formaPagamento.toLowerCase()) {
            case "pix":
            case "espécie":
            case "transferência":
            case "débito":
                desconto = produto.getValor() * 0.05;
                valorComDesconto = produto.getValor() - desconto;
                System.out.println("Desconto de 5% aplicado. Valor final: R$" + String.format("%.2f", valorComDesconto));

                // Verifica se é em espécie e calcula troco
                if (formaPagamento.equalsIgnoreCase("espécie")) {
                    if (valorPago >= valorComDesconto) {
                        troco = valorPago - valorComDesconto;
                        System.out.println("Valor pago: R$" + String.format("%.2f", valorPago));
                        System.out.println("Troco: R$" + String.format("%.2f", troco));
                    } else {
                        System.out.println("Valor insuficiente! Faltam R$" + String.format("%.2f", valorComDesconto - valorPago));
                        return;
                    }
                }
                break;
            case "crédito":
                System.out.println("Pagamento no crédito. Você pode parcelar em até 3x sem juros.");
                System.out.println("Valor por parcela: R$" + String.format("%.2f", produto.getValor() / 3));
                break;
            default:
                System.out.println("Forma de pagamento não reconhecida.");
                return;
        }

        System.out.println("Pagamento realizado com sucesso!");
    }
}
