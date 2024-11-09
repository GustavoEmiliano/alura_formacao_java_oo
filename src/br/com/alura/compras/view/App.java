package br.com.alura.compras.view;

import br.com.alura.compras.model.CartaoDeCredito;
import br.com.alura.compras.model.Compra;

import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("|            \uD83D\uDCB3 CARTÃO \uD83D\uDCB3           |");
        System.out.println("=====================================");

        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("=====================================");
            System.out.println("|          REALIZAR COMPRA          |");
            System.out.println("=====================================");

            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("=====================================");
                System.out.println("|        ✔\uFE0FCompra realizada✔\uFE0F      |");
                System.out.println("=====================================");

                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("=====================================");
        System.out.println("|      \uD83D\uDCCB COMPRAS REALIZADAS \uD83D\uDCCB     |");
        System.out.println("=====================================");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValorProduto());
        }
        System.out.println("=====================================");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
        System.out.println("=====================================");

    }
}