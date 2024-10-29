package desafios.desafio_03;

public class Carro {
    protected String nomeModelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;


    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double retornaMenorPreco(){
        return Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    public double retornaMaiorPreco(){
        return Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    public double calcularMediaPreco(){
        return (precoAno1 + precoAno2 + precoAno3) / 3;
    }

    public void mostrarInformacoes(){
        System.out.println("===========================");
        System.out.println("|       INFORMAÇÕES       |");
        System.out.println("===========================");
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preço ano 1: " + precoAno1);
        System.out.println("Preço ano 2: " + precoAno2);
        System.out.println("Preço ano 3: " + precoAno3);
        System.out.println("Menor preço: " + retornaMenorPreco());
        System.out.println("Maior preço: " + retornaMaiorPreco());
        System.out.println("Preço médio: " + calcularMediaPreco());
        System.out.println("===========================");
    }
}
