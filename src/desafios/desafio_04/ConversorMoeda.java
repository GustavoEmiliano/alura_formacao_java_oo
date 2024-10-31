package desafios.desafio_04;

public class ConversorMoeda implements ConversaoFinanceira {

    private final static double TAXA_CONVERSÃO = 4.40;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSÃO;
    }
}
