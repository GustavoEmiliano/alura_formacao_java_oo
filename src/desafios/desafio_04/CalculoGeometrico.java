/*
Exercicio 2:
Crie uma classe CalculadoraSalaRetangular que implementa uma interface
CalculoGeometrico com os métodos calcularArea() e calcularPerimetro()
para calcular a área e o perímetro de uma sala retangular.
A classe deve receber altura e largura como parâmetros.
*/

package desafios.desafio_04;

public interface CalculoGeometrico {
    double calcularArea(double altura, double largura);
    double calcularPerimetro(double altura, double largura);


}
