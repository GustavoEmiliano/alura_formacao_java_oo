package desafios.desafio_03;

public class Main {
    public static void main(String[] args) {
        Carro logan = new Carro();
        logan.setNomeModelo("Logan");
        logan.setPrecoAno1(10000.00);
        logan.setPrecoAno2(20000.00);
        logan.setPrecoAno3(30000.00);
        logan.mostrarInformacoes();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setNomeModelo("Sedan");
        modeloCarro.mostrarInformacoes();

        Cachorro cachorro = new Cachorro();
        cachorro.setNomeAnimal("Rex");
        cachorro.setIdadeAnimal(3);
        cachorro.setRaca("Labrador");
        cachorro.mostrarInformacoes();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        System.out.println();

        Gato gato = new Gato();
        gato.setNomeAnimal("Mingau");
        gato.setIdadeAnimal(2);
        gato.setCor("Branco");
        gato.mostrarInformacoes();
        gato.emitirSom();
        gato.arranharMoveis();

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(100);
        conta.consultarSaldo();
        conta.sacar(30);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();

        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();
        verificador.verificarSeEhPrimo(29);
        verificador.verificarSeEhPrimo(30);
        System.out.println("Números primos até 50: " + gerador.listarPrimos(50));
        int proximoPrimo = gerador.gerarProximoPrimo(30);
        System.out.println("O próximo primo após 30 é: " + proximoPrimo);
    }
}
