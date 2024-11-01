/*
Exercicio 1:
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
com o método converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
*/

package desafios.desafio_04;

public class ConversorMoeda implements ConversaoFinanceira {

    private final static double TAXA_CONVERSÃO = 4.40;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSÃO;
    }
}
