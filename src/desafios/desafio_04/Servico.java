package desafios.desafio_04;

public class Servico implements Vendavel {
    private double taxaHora;
    private double precoComDesconto;

    @Override
    public double calcularPrecoTotal(int quan) {
        return taxaHora * quantidadeHoras;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto, int quantidadeHoras) {
        precoComDesconto = calcularPrecoTotal(quantidadeHoras) - percentualDesconto;
        return precoComDesconto;
    }
}
