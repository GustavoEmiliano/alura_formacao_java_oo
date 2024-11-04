/*
Exercício:

Para reforçar a compreensão sobre construtores, sugerimos atividades práticas
(não obrigatórias) que aprofundarão seus conhecimentos fundamentais.

Pronto para mergulhar nesse aprendizado prático?

1. Crie uma classe Produto com atributos como nome, preco, e quantidade.
   Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
   Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

2. Implemente o método toString() na classe Produto para retornar uma representação
   em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método
   System.out.println().

3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para
   inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.

4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade
   e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos
   herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
*/

package desafios.desafio_06;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 2000, 1);
        Produto produto2 = new Produto("Geladeira", 7000, 1);
        Produto produto3 = new Produto("Televisão", 1750, 1);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("O tamanho da lista é: " + listaDeProdutos.size());
        System.out.println("Produto 1: " + listaDeProdutos.get(0).getNome());

        ProdutoPerecivel peixe = new ProdutoPerecivel("Peixe", 50, 1, LocalDate.of(2024, 10, 20));


    }
}
