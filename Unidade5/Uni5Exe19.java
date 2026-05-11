package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ---- Programa para calcular o valor de uma compra com desconto ----");

        System.out.println("Informe o valor da compra nº 1 (ou 0 para finalizar): ");
        double valorCompraAtual = teclado.nextDouble();
        double valorAPagarAtual = 0;
        double valorTotalRecebidoLoja = 0;
        int quantidadeDeCompras = 1;

        while (valorCompraAtual != 0) {

            if (valorCompraAtual > 500.00) {
                valorAPagarAtual = valorCompraAtual - (valorCompraAtual * 0.20);
                System.out.println("Compra maior que R$ 500,00. Desconto de 20% aplicado");
            }

            else {
                valorAPagarAtual = valorCompraAtual - (valorCompraAtual * 0.15);
                System.out.println("Compra menor ou igual à R$ 500,00. Desconto de 15% aplicado");
            }

            System.out.println("O valor a pagar da compra atual é de R$ " +  valorAPagarAtual);
            quantidadeDeCompras++;
            valorTotalRecebidoLoja = valorTotalRecebidoLoja + valorAPagarAtual;


            System.out.println(" --- Seguindo para a próxima compra --- \n\r Informe o valor da compra nº " + quantidadeDeCompras + " (ou 0 para finalizar): ");
            valorCompraAtual = teclado.nextDouble();
            
        }

        System.out.println(" ---- Finalizando ---- \n\r O valor total recebido pela loja ao final do dia foi de R$ " + valorTotalRecebidoLoja);

        teclado.close();
    }
    
}
