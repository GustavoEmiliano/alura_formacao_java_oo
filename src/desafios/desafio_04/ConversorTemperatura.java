/*
Exercicio 4:
Crie uma interface ConversorTemperatura com os métodos
celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface
com as fórmulas de conversão e exibe os resultados.
*/

package desafios.desafio_04;

public interface ConversorTemperatura {
    void celsiusParaFahrenheit(double valorTemperaturaCelsius);
    void fahrenheitParaCelsius(double valorTemperaturaFahrenheit);
}
