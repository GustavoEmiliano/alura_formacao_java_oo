/*
Exercicio 3:
Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada
com o método mostrarTabuada() para exibir a tabuada de um número.
A classe deve receber o número como parâmetro.
*/

package desafios.desafio_04;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
