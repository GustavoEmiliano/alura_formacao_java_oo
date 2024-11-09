package desafios.desafio_07;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta='" + numeroDaConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
