/*
Exercicio 5:
Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico,
cada uma retornando o preço final considerando descontos ou taxas adicionais.
*/

package desafios.desafio_04;

public class ProdutoFisico implements Calculavel{
    private double precoBase;
    private double taxaAdicional;

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * (taxaAdicional / 100));
    }
}
