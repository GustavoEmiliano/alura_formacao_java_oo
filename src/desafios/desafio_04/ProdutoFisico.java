package desafios.desafio_04;

public class ProdutoFisico implements Calculavel{
    private double precoBase;
    private double taxaAdicional;

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * (taxaAdicional / 100));
    }
}
