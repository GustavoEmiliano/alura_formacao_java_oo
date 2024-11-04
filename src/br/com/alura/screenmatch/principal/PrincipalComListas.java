package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix", 1999, "Lana Wachowsk");
        matrix.avalia(10);
        Filme johnWick = new Filme("John Wick", 2014, "Chad Stahelski");
        johnWick.avalia(10);
        Filme avatar = new Filme("Avatar", 2009,"James Cameron");
        avatar.avalia(10);
        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> listaDeAsssistidos = new ArrayList<>();
        listaDeAsssistidos.add(matrix);
        listaDeAsssistidos.add(johnWick);
        listaDeAsssistidos.add(avatar);
        listaDeAsssistidos.add(laCasaDePapel);

        for (Titulo item: listaDeAsssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            } else if (item instanceof Serie serie && serie.get){
                System.out.println("");
            }
        }
    }
}
