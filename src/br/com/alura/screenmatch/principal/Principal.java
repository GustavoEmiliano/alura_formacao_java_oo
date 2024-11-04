package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix", 1999, "Lana Wachowsk");
        // matrix.setNome("The Matrix");
        //matrix.setAnoDeLancamento(1999);
        matrix.setDuracaoEmMinutos(135);
        matrix.setIncluidoNoPlano(true);
        matrix.avalia(10);

        Filme johnWick = new Filme("John Wick", 2014, "Chad Stahelski");
        // johnWick.setNome("John Wick");
        //johnWick.setAnoDeLancamento(2014);
        johnWick.setDuracaoEmMinutos(101);
        johnWick.setIncluidoNoPlano(true);
        johnWick.avalia(9);

        Filme avatar = new Filme("Avatar", 2009,"James Cameron");
        // avatar.setNome("Avatar");
        //avatar.setAnoDeLancamento(2009);
        avatar.setDuracaoEmMinutos(400);
        avatar.setIncluidoNoPlano(true);
        avatar.avalia(10);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017);
        //laCasaDePapel.setNome("La Casa de Papel");
        //laCasaDePapel.setAnoDeLancamento(2017);
        laCasaDePapel.setIncluidoNoPlano(true);
        laCasaDePapel.setAtiva(true);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setEpisodiosPorTemporada(10);
        laCasaDePapel.setMinutospPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(matrix);
        calculadora.inclui(johnWick);
        calculadora.inclui(laCasaDePapel);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(matrix);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(laCasaDePapel);
        episodio.setTotalAvaliacoes(300);
        filtro.filtra(episodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(matrix);
        listaDeFilmes.add(johnWick);
        listaDeFilmes.add(avatar);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " +listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println("Listagem: " + listaDeFilmes);

    }

}