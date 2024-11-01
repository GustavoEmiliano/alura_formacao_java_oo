/*
Exercicio 6:
Crie uma interface Vendavel com métodos para calcular o preço total
de um produto com base na quantidade comprada e aplicar descontos.
Implemente essa interface nas classes Produto e Servico,
cada uma fornecendo a sua própria lógica de cálculo de preço.
*/

package desafios.desafio_04;

public class Produto implements Vendavel{
    private double precoProduto;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return quantidade * precoProduto;
    }
}
