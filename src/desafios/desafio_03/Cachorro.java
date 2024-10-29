package desafios.desafio_03;

public class Cachorro extends Animal{
    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void abanarRabo(){
        System.out.println(nomeAnimal + " está abanando o rabo");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Raça: " + raca);
    }

    @Override
    public void emitirSom() {
        System.out.println(nomeAnimal + " está latindo! Au Au!");
    }
}
