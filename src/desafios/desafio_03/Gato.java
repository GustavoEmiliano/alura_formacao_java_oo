package desafios.desafio_03;

public class Gato extends Animal{
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void arranharMoveis(){
        System.out.println(nomeAnimal + " está arranhando os móveis!");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cor: " + cor);
    }

    @Override
    public void emitirSom() {
        System.out.println(nomeAnimal + " está miando! Miau Miau");
    }

}
