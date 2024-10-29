package desafios.desafio_03;

public class Animal {
    protected String nomeAnimal;
    protected int idadeAnimal;

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Idade: " + idadeAnimal + " anos");
    }

    public void emitirSom(){
        System.out.println("O animal fez um som!");
    }
}
