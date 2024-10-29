package desafios.desafio_03;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 10.00;

    public void cobrarTarifaMensal(){
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada.");
        } else {
            System.out.println("Saldo insuficiente para cobrança da tarifa mensal>");
        }
    }

}
