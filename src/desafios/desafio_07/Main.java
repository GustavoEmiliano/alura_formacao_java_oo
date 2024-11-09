/*
Para aprimorar suas habilidades em ArrayLists, casting de objeto e instanceof
propomos atividades práticas (não obrigatórias) que enriquecerão ainda mais sua
compreensão desses princípios fundamentais.

Vamos mergulhar em java?

1 - Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir
cada elemento da lista.

2 - Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida,
crie um objeto da classe Cachorro e faça o casting para a classe Animal.

3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para
garantir que o objeto seja do tipo correto antes de fazer o casting.

4 - Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma
lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

5 - Crie uma interface Forma com um método calcularArea(). Implemente a interface em
duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas
(objetos da interface Forma) e utilize um loop para calcular e imprimir a área de
cada forma.

6 - Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em
seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop
para encontrar e imprimir a conta com o maior saldo.
*/

package desafios.desafio_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Execício 1 - Utilizando mais de uma maneira para percorrer uma lista
        ArrayList<String> listaDeStrings = new ArrayList<>();
        System.out.println(" ");
        listaDeStrings.add("Olá");
        listaDeStrings.add("Tudo bem!");
        listaDeStrings.add("Meu nome é Gustavo!");

        listaDeStrings.forEach(System.out::println);
        System.out.println(" ");

        listaDeStrings.forEach(string -> System.out.println(string));
        System.out.println(" ");

        for(String string : listaDeStrings){
            System.out.println(string);
        }
        System.out.println(" ");

        // Exercício 2 e 3

        Cachorro cachorro = new Cachorro("Bob", "Golden");

        System.out.println(cachorro);

        if (cachorro instanceof Animal) {
            Animal animal = (Animal) cachorro;
            System.out.println(animal.som());
        }
        System.out.println(" ");

        // Exercício 4

        Produto celular = new Produto("Celular", 1000.00);
        Produto cadeira = new Produto("Cadeira Gamer", 1000.00);
        Produto sofa = new Produto("Sofá", 1000.00);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(celular);
        listaDeProdutos.add(cadeira);
        listaDeProdutos.add(sofa);

        if (listaDeProdutos.isEmpty()){
            System.out.println("Não foi possível calcular a média do valor, a lista está vazia!");
        } else {
            double precoMedio = 0;
            for (Produto produto : listaDeProdutos) {
                precoMedio += produto.getPreco();
            }
            System.out.printf("O preço médio dos produtos é de R$ %.2f",precoMedio / listaDeProdutos.size());        System.out.println(" ");
            System.out.println(" ");
        }

        // Exercício 5
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(2.0));
        for (Forma forma : formas) {
            System.out.printf("A área do %s é: %.2f%n", forma, forma.calcularArea());
        }
        System.out.println(" ");

        // Exercício 6

        List<ContaBancaria> listaContaBancaria = new ArrayList<>();
        listaContaBancaria.add(new ContaBancaria("5927497", 1000.00));
        listaContaBancaria.add(new ContaBancaria("4234233", 5000.00));
        listaContaBancaria.add(new ContaBancaria("2343244", 3000.00));

        ContaBancaria contaBancariaComMaiorSaldo = listaContaBancaria.get(0);

        for (ContaBancaria conta : listaContaBancaria){
            if (conta.getSaldo() > contaBancariaComMaiorSaldo.getSaldo()){
                contaBancariaComMaiorSaldo = conta;
            }
        }
        System.out.println("A conta com maior saldo é: " + contaBancariaComMaiorSaldo.getSaldo());
    }
}
