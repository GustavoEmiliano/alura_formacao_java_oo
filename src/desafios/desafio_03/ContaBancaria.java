package desafios.desafio_03;

public class ContaBancaria {
    protected long numeroConta;
    protected double saldo;
    protected String titular;

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Seu depósito foi concluído! Seu saldo agora é de R$ " + saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor){
        if (saldo >= valor && valor > 0){
            saldo -= valor;
            System.out.println("Seu saque foi efetuado com sucesso!");
            System.out.println("Seu saldo agora é de R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double consultarSaldo(){
        System.out.println("Seu saldo atual é de: " + saldo);
        return saldo;
    }
}
