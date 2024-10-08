public class Venda {
    private int quantidade;
    private double valorProduto;
    private double valorCompra;
    private double valorPagamento;
    private String metodoPagamento;
    private double troco;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void setValorCompra() {
        if (this.metodoPagamento.equalsIgnoreCase("pix") ||
            this.metodoPagamento.equalsIgnoreCase("especie") ||
            this.metodoPagamento.equalsIgnoreCase("transferencia") ||
            this.metodoPagamento.equalsIgnoreCase("debito")) {
            this.valorCompra = (this.valorProduto * this.quantidade) * 0.95;
        } else {
            this.valorCompra = this.valorProduto * this.quantidade;
        }
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco() {
        this.troco = this.valorPagamento - this.valorCompra;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
}
