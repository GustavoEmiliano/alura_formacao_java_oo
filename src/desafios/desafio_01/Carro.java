/*
Exercício 4:
 Crie uma classe Carro com atributos modelo, ano, cor e métodos para
 exibir a ficha técnica e calcular a idade do carro.
*/

package desafios.desafio_01;

import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    double calculaIdadeCarro(){
        double anoAtual = LocalDate.now().getYear();
        double idadeCarro = anoAtual - ano;
        return idadeCarro;
    }


}
