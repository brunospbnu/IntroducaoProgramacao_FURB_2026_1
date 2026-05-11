package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para gerar relatório com: \n\r Nome de Vendedores, Total de Vendas e Salário do Vendedor");
        
        char continuarVendedor = 's';
        int numeroVendedor = 1;
        
        String dadosCompletos = "";

        while (continuarVendedor == 's') {

            System.out.print("Digite o Nome do " + numeroVendedor + "º vendedor: ");
            String vendedorAtual = teclado.next();

            int quantidadeProdutos = 1;
            char continuarProduto = 's';
            double valorTotalVendido = 0;

            while (continuarProduto == 's') {
                
                System.out.print("Digite o Preço do Produto nº " + quantidadeProdutos + ": ");
                double precoProdutoAtual = teclado.nextDouble();
                System.out.print("Digite a Quantidade do Produto: " + quantidadeProdutos + ": ");
                int quantidadeProdutoAtual = teclado.nextInt();

                double valorTotalProdutoAtual = precoProdutoAtual * quantidadeProdutoAtual;

                valorTotalVendido = valorTotalVendido + valorTotalProdutoAtual;
                
                System.out.print("Deseja cadastrar mais um produto s (SIM) / n (NÃO)");
                continuarProduto = teclado.next().charAt(0);

                while (continuarProduto != 's' && continuarProduto != 'n') {
                    System.out.print("Resposta incorreta, responda 's' (para SIM) / 'n' (para NÃO)");
                    continuarProduto = teclado.next().charAt(0);
                }

                quantidadeProdutos++;

            }
            double salarioVendedorAtual = valorTotalVendido * 0.30;

            dadosCompletos = dadosCompletos + (" \n\r Nome do Vendedor: " + vendedorAtual + "; total de vendas: " + (quantidadeProdutos-1) + "; Salário: " + salarioVendedorAtual);

            System.out.print("Deseja cadastrar mais um vendedor s (SIM) / n (NÃO)");
                continuarVendedor = teclado.next().charAt(0);

                while (continuarVendedor != 's' && continuarVendedor != 'n') {
                    System.out.print("Resposta incorreta, responda 's' (para SIM) / 'n' (para NÃO)");
                    continuarVendedor = teclado.next().charAt(0);
                }
                numeroVendedor++;        
        }

        System.out.println(dadosCompletos);


        teclado.close();
    }
    
}
