/*
Exercicio 5:
Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico,
cada uma retornando o preço final considerando descontos ou taxas adicionais.
*/


package desafios.desafio_04;

public class Livro implements Calculavel{

    private double precoBase;
    private double desconto;

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * (desconto/100));
    }
}
