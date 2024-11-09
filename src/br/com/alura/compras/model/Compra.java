package br.com.alura.compras.model;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valorProduto;

    public Compra(String descricao, double valorProduto) {
        this.descricao = descricao;
        this.valorProduto = valorProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor = " + valorProduto;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outraCompra.getValorProduto()));
    }
}
