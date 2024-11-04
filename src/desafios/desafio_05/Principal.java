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

2. No método main da classe br.com.alura.screenmatch.principal.Principal, crie um ArrayList de Pessoa chamado listaDePessoas.

3. Adicione pelo menos três pessoas à lista utilizando o método add.

4. Imprima o tamanho da lista utilizando o método size.

5. Imprima a primeira pessoa da lista utilizando o método get.

6. Imprima a lista completa.
*/

package desafios.desafio_05;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gustavo", 18);
        Pessoa pessoa2 = new Pessoa("Janiely", 17);
        Pessoa pessoa3 = new Pessoa("Gabriel", 17);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Listagem :" + listaDePessoas);


    }
}
