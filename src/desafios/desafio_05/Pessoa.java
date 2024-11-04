/*
Exercício:

Aprendemos a representar listas com ArrayList e que os métodos add, size e get
facilitam a manipulação. Além disso, o método toString() é essencial para
visualizar objetos em texto.

Para solidificar esses conceitos, sugerimos atividades práticas (não obrigatórias)
que aprimorarão sua compreensão desses princípios fundamentais. Está preparado para
aplicar essas ideias?

1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString
   que represente esses atributos.

2. No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.

3. Adicione pelo menos três pessoas à lista utilizando o método add.

4. Imprima o tamanho da lista utilizando o método size.

5. Imprima a primeira pessoa da lista utilizando o método get.

6. Imprima a lista completa.
*/

package desafios.desafio_05;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
