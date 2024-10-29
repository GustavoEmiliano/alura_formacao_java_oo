/*
 * Exercício 5:
 * Desenvolva uma classe Livro com os atributos privados titulo e autor.
 * Utilize métodos getters e setters para acessar e modificar esses atributos.
 * Adicione um método exibirDetalhes que imprime o título e o autor do livro.
 */

package desafios.desafio_02;

public class Livro {
    private String titulo;
    private String autor;

    public void exibirDetalhes(){
        System.out.println("============================");
        System.out.println("|         DETALHES         |");
        System.out.println("============================");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
