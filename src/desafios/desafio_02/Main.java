package desafios.desafio_02;

public class Main {
    public static void main(String[] args) {

        // 1 - Conta Bancária
        System.out.println("============================");
        System.out.println("|         CONTA            |");
        System.out.println("============================");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(550203590);
        String titular = contaBancaria.titular = "Gustavo";
        System.out.println("Número da Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Titular: " + titular);

        // 2 - Idade da Pessoa
        System.out.println("============================");
        System.out.println("|        IDADE PESSOA      |");
        System.out.println("============================");
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Gustavo");
        idadePessoa.setIdade(18);
        System.out.println("Nome: " + idadePessoa.getNome());
        System.out.println("Idade: " + idadePessoa.getIdade());
        idadePessoa.verificarIdade();

        // 3 - Produto
        System.out.println("============================");
        System.out.println("|         PRODUTO          |");
        System.out.println("============================");
        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setPreco(4500.00);
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço antes do desconto: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Preço após desconto: " + produto.getPreco());

        // 4 - Aluno
        System.out.println("============================");
        System.out.println("|         ALUNO            |");
        System.out.println("============================");
        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo");
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setNota3(10);
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Média das Notas: " + aluno.calcularMedia());

        // 5 - Livro
        Livro livro = new Livro();
        livro.setTitulo("O Cortiço");
        livro.setAutor("Aluísio de Azevedo");
        livro.exibirDetalhes();
        System.out.println("============================");
    }
}
