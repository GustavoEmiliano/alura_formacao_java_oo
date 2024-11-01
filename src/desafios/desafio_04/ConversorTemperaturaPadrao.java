/*
Exercicio 4:
Crie uma interface ConversorTemperatura com os métodos
celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface
com as fórmulas de conversão e exibe os resultados.
*/

package desafios.desafio_04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double valorTemperaturaCelsius) {
        double temperaturaConvertida = (valorTemperaturaCelsius * 1.8) + 32;
    }

    @Override
    public void fahrenheitParaCelsius(double valorTemperaturaFahrenheit) {
        double temperaturaConvertida = 5/9 * (valorTemperaturaFahrenheit - 32);
    }
}
