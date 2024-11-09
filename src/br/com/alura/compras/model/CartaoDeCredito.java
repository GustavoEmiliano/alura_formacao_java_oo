package br.com.alura.compras.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDeCredito;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
        this.saldo = limiteDeCredito;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValorProduto()){
            this.saldo -= compra.getValorProduto();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
