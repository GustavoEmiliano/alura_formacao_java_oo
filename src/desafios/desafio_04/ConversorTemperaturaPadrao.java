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
