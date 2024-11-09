package desafios.desafio_07;


public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "Círculo com raio " + raio;
    }
}
