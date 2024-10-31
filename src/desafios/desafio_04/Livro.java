package desafios.desafio_04;

public class Livro implements Calculavel{

    private double precoBase;
    private double desconto;

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * (desconto/100));
    }
}
