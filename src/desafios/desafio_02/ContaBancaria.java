/*
 * Exercício 1:
 * Crie uma classe ContaBancaria com os seguintes atributos:
 * numeroConta (privado), saldo (privado) e titular (público).
 * Implemente métodos getters e setters para os atributos privados.
 */

package desafios.desafio_02;

public class ContaBancaria {
    private long numeroConta;
    private double saldo;
    String titular;

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
