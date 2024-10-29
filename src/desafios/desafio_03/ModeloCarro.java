package desafios.desafio_03;

public class ModeloCarro extends Carro {

    @Override
    public void mostrarInformacoes() {
        System.out.println("===========================");
        System.out.println("|       INFORMAÇÕES       |");
        System.out.println("===========================");
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("===========================");

    }
}
