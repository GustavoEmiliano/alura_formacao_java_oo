package desafios.desafio_07;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String som(){
        return "som";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
