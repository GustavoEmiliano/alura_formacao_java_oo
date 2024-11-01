/*
Exercicio 6:
Crie uma interface Vendavel com métodos para calcular o preço total
de um produto com base na quantidade comprada e aplicar descontos.
Implemente essa interface nas classes Produto e Servico,
cada uma fornecendo a sua própria lógica de cálculo de preço.
*/

package desafios.desafio_04;

public class Servico implements Vendavel {

    private double precoServico;


    @Override
    public double calcularPrecoTotal(int quantidade) {
        double valorDesconto = 0;
        double valorServicoTotal = (precoServico * quantidade);
        if (valorServicoTotal > 1000){
            valorDesconto = 100;
            return valorServicoTotal - valorDesconto;
        }
        return valorServicoTotal;
    }
}
