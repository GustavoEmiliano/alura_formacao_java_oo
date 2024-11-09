/*
A compreensão profunda de Collections.sort, LinkedList, Comparable, compareTo, sort e ArrayLists
capacitam a ordenação eficiente de dados, enquanto a interface Comparable e o método compareTo
oferecem controle sobre a ordem desejada.

Para consolidar e aprimorar essas habilidades, propomos atividades práticas (não obrigatórias).

Vamos lá?

1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
   Em seguida, imprima a lista ordenada.

2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe
   para que seja possível ordenar uma lista de objetos Titulo.

3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método
   Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
   Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso
   de polimorfismo.
*/

package desafios.desafio_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Exercício 1

        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(1);
        listaDeInteiros.add(2);
        listaDeInteiros.add(3);
        listaDeInteiros.add(4);
        Collections.sort(listaDeInteiros);
        System.out.println("Lista ordenada: "+  listaDeInteiros);

        // Exercício 2 e 3

        Titulo among = new Titulo("Among Us");
        Titulo clash = new Titulo("Clash Royale");
        Titulo clash2 = new Titulo("Clash Of Clans");
        Titulo brawl = new Titulo("Brawl Stars");
        Titulo minecraft = new Titulo("Minecraft");
        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(clash);
        listaDeTitulos.add(among);
        listaDeTitulos.add(brawl);
        listaDeTitulos.add(minecraft);
        listaDeTitulos.add(clash2);
        Collections.sort(listaDeTitulos);
        System.out.println("Lista de títulos ordenada: " + listaDeTitulos);

        //Exercício 4 e 5

        // Usando ArrayList como implementação de List
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println("Lista usando ArrayList: " + lista);
        // Trocando para LinkedList
        lista = new LinkedList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println("Lista usando LinkedList: " + lista);

    }
}
