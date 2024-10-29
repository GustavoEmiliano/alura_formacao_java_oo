package desafios.desafio_01;

public class Main {
    public static void main(String[] args) {

        // 1
        Pessoa pessoa = new Pessoa();
        System.out.println("Saída exercício 1: ");
        pessoa.saudacao();
        System.out.println(" ");

        // 2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println("Saída exercício 2: ");
        System.out.println(resultado);
        System.out.println(" ");

        // 3
        Musica musica = new Musica();
        musica.titulo = "Vida Chique";
        musica.artista = "Veigh";
        musica.anoLancamento = 2022;
        System.out.println("Saída exercício 3: ");
        musica.exibeFichaTecnica();
        musica.avaliarMusica(10.0);
        musica.avaliarMusica(10.0);
        musica.avaliarMusica(10.0);
        double mediaAvaliacoes = musica.retornaMedia();
        System.out.println("Média de avaliações: " + mediaAvaliacoes);
        System.out.println(" ");

        // 4
        Carro carro = new Carro();
        carro.modelo = "Lancer";
        carro.ano = 1973;
        carro.cor = "Black Piano";
        System.out.println("Saída exercício 4: ");
        carro.exibeFichaTecnica();
        System.out.printf("Idade do Carro: anos %.0f",carro.calculaIdadeCarro());
        System.out.println(" ");
        System.out.println(" ");


        //5
        Aluno aluno = new Aluno();
        aluno.nome = "Gustavo";
        aluno.idade = 18;
        System.out.println("Saída exercício 5: ");
        aluno.exibeInformacoes();

    }
}
