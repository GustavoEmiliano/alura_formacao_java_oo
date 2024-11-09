package desafios.desafio_07;

public class Cachorro extends Animal {
    protected String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public String som() {
        return "Au Au!";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
